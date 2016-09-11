package sbtmultiplatforms

import sbt._

object MultiPlatformsPlugin extends AutoPlugin {

  val autoImport = AutoImport
  object AutoImport extends CrossProjectExtra {}

}
