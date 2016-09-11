lazy val app = crossProject2
  .settings(
    scalaVersion := "2.11.8"
  )
  .jsSettings(
    libraryDependencies += "org.scala-js" %%% "scalajs-dom"  % "0.9.1",
    name := "app js"
  )
  .jvmSettings(
    name := "app jvm"
  )
  .nativeSettings(
    name := "app native"
  )

lazy val appJs = app.js
lazy val appJVM = app.jvm
lazy val appNative = app.native