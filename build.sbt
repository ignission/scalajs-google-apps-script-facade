name := "google-apps-script-scalajs-facade"

lazy val commonSettings = Seq(
  version := "0.3.0",
  scalaVersion := "2.13.5",
  organization := "tech.ignission"
)

normalizedName := "google-apps-script-scalajs-facade"

lazy val noPublishSettings = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false,
  skip in publish := true
)

lazy val publishPackages = Seq(
  isSnapshot := version.value endsWith "SNAPSHOT",
  publishTo in ThisBuild := sonatypePublishToBundle.value,
  publishMavenStyle := true,
  publishArtifact in Test := false,
  publishArtifact in (Compile, packageDoc) := true,
  publishArtifact in (Compile, packageSrc) := true,
  pomIncludeRepository := { _ => false },
  sonatypeTimeoutMillis := 3 * 60 * 60 * 1000,
  publishConfiguration := publishConfiguration.value.withOverwrite(true),
  publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
  homepage := Some(url("https://github.com/ignission")),
  sources in (Compile, doc) := Seq.empty,
  licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/ignission/scalajs-google-apps-script-facade"),
      "scm:git:git@github.com/ignission/scalajs-google-apps-script-facade.git"
    )
  ),
  developers := List(
    Developer(
      id    = "shoma416",
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

