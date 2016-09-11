sbtPlugin := true

scalaVersion := "2.10.6"

organization := "com.example"

name := "sbt-multi-platforms"

version := "0.1.0-SNAPSHOT"

resolvers += Resolver.sonatypeRepo("snapshots")

// libraryDependencies ++= Seq(
//   "org.scala-js" %% "sbt-scalajs" % "0.6.12",
//   "org.scala-native" %% "sbtplugin" % "0.1-SNAPSHOT"
// )
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.12")
addSbtPlugin("org.scala-native" % "sbtplugin"  % "0.1-SNAPSHOT")

ScriptedPlugin.scriptedSettings
scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false