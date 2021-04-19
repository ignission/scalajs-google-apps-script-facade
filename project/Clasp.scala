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
    Process("clasp deployments", new File(cwd)) ! logger.log
    val deploymentRow = logger.out(2)
    val deployId      = deploymentRow.split(' ')(1)
    Process(s"clasp deploy -i $deployId") ! logger.log
    logger.print()
  }
}
