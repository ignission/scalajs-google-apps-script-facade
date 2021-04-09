import scala.sys.process._
import java.io.File

val login = taskKey[Unit]("Login with clasp")
val push = taskKey[Unit]("Push sources")

login := {
  val out = scala.collection.mutable.ArrayBuffer[String]()
  val err = scala.collection.mutable.ArrayBuffer[String]()

  val logger = ProcessLogger(
    (o: String) => out += o,
    (e: String) => err += e)

  Process(Seq("clasp", "login")) ! logger

  println(out.toList.mkString("\n"))
  println(err.toList.mkString("\n"))
}

push := {
  val out = scala.collection.mutable.ArrayBuffer[String]()
  val err = scala.collection.mutable.ArrayBuffer[String]()

  val logger = ProcessLogger(
    (o: String) => out += o,
    (e: String) => err += e)

  (Compile / fullLinkJS).value

  sbt.IO.copyFile(
    new File("example/target/scala-2.13/example-opt/main.js"),
    new File("example/dist/main.js")
  )

  Process(command = "clasp push -f", cwd = new File("example")) ! logger

  println(out.toList.mkString("\n"))
  println(err.toList.mkString("\n"))
}
