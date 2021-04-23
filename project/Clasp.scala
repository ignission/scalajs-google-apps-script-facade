import scala.sys.process._
import java.io.File
import sbt.Keys._

class Logger {
  val out = scala.collection.mutable.ArrayBuffer[String]()
  val err = scala.collection.mutable.ArrayBuffer[String]()
  val log = ProcessLogger((o: String) => out += o, (e: String) => err += e)

  def print(): Unit = {
    println(out.toList.mkString("\n"))
    println(err.toList.mkString("\n"))
  }

  def flush(): Unit = {
    out.clear()
    err.clear()
  }
}

object Clasp {

  def dist(name: String, scalaBintrayVersion: String, cwd: String): Unit = {
    val distFile = new File(s"$cwd/dist/main.js")

    sbt.IO.copyFile(
      new File(s"$cwd/target/scala-$scalaBintrayVersion/$name-fastopt.js"),
      distFile
    )

    println("main.js has been copied to " + distFile.getAbsolutePath())
  }

  def push(cwd: String): Unit = {
    val logger = new Logger
    Process("clasp push -f", new File(cwd)) ! logger.log
    logger.print()
  }

  def deploy(cwd: String): Unit = {
    val logger = new Logger
    val dir    = new File(cwd)

    Process("clasp deployments", dir) ! logger.log
    logger.print()

    if (logger.out.length <= 2) {
      logger.flush()
      Process("clasp deploy", dir) ! logger.log
      logger.print()
    }

    val deploymentRow = logger.out(logger.out.length - 1)
    val deployId      = deploymentRow.split(' ')(1)

    logger.flush()

    val deployCmd = s"clasp deploy -i $deployId"
    Process(
      Seq("clasp", "deploy", "-i", deployId, "-d", "deployed from sbt"),
      dir
    ) ! logger.log
    logger.print()
  }
}
