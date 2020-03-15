
name := "Scala.js Google Apps Script"

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.13.1",
  organization := "tech.ignission"
)

sonatypeProfileName := "tech.ignission"

normalizedName := "scalajs-google-apps-script"

isSnapshot := version.value endsWith "SNAPSHOT"

lazy val noPublishSettings = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false,
  skip in publish := true
)

lazy val publishPackages = Seq(
  publishMavenStyle := true,
  publishArtifact in Test := false,
  publishTo := {
    val realm = "Sonatype Nexus Repository Manager"
    val staging = "https://oss.sonatype.org/content/repositories/snapshots"
    val release = "https://oss.sonatype.org/service/local/staging/deploy/maven2"
    if (isSnapshot.value)
      Some(realm at staging)
    else
      Some(realm at release)
  },
  credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
  homepage := Some(url("https://github.com/ignission")),
  licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
  scmInfo := Some(ScmInfo(url("https://github.com/ignission/scalajs-google-apps-script"), "scm:git:git@github.com/ignission/scalajs-google-apps-script.git")),
  developers := List(
    Developer(
      id    = "shomatan",
      name  = "Shoma Nishitateno",
      email = "shoma416@gmail.com",
      url   = url("https://github.com/shomatan")
    )
  )
)

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(publishPackages)

lazy val example = project.in(file("example"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(noPublishSettings)
  .dependsOn(root)

