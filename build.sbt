name := "google-apps-script-scalajs-facade"

normalizedName := "google-apps-script-scalajs-facade"

ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"

lazy val commonSettings = Seq(
  version := "0.5.0",
  scalaVersion := "2.13.5",
  organization := "tech.ignission",
  scalacOptions ++= List(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Yrangepos",
    "-Ymacro-annotations",
    "-Xlint"
  )
)

lazy val noPublishSettings = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false,
  skip / publish := true
)

lazy val publishPackages = Seq(
  isSnapshot := version.value endsWith "SNAPSHOT",
  ThisBuild / publishTo := sonatypePublishToBundle.value,
  publishMavenStyle := true,
  Test / publishArtifact := false,
  Compile / packageDoc / publishArtifact := true,
  Compile / packageSrc / publishArtifact := true,
  pomIncludeRepository := { _ => false },
  sonatypeTimeoutMillis := 3 * 60 * 60 * 1000,
  publishConfiguration := publishConfiguration.value.withOverwrite(true),
  publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
  homepage := Some(url("https://github.com/ignission")),
  Compile / doc / sources := Seq.empty,
  licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/ignission/scalajs-google-apps-script-facade"),
      "scm:git:git@github.com/ignission/scalajs-google-apps-script-facade.git"
    )
  ),
  developers := List(
    Developer(
      id = "shoma416",
      name = "Shoma Nishitateno",
      email = "shoma416@gmail.com",
      url = url("https://github.com/shomatan")
    )
  )
)

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(publishPackages)

lazy val example = project
  .in(file("example"))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(noPublishSettings)
  .settings(
    scalacOptions ++= List(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Yrangepos",
      "-Ymacro-annotations",
      "-Ywarn-unused",
      "-Xlint",
      "-Xfatal-warnings"
    )
  )
  .settings(
    addCompilerPlugin(scalafixSemanticdb),
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
  .dependsOn(root)

addCommandAlias("fix", "all example/compile:scalafix; example/test:scalafix")
addCommandAlias("fixCheck", "; compile:scalafix --check; test:scalafix --check")
addCommandAlias("format", "; scalafmt; test:scalafmt; scalafmtSbt")
addCommandAlias("formatCheck", "; scalafmtCheck; test:scalafmtCheck; scalafmtSbtCheck")
addCommandAlias("fixAll", "fix; format")
addCommandAlias("checkAll", "fixCheck; formatCheck")
