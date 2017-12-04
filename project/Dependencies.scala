import sbt.Keys._
import sbt._

object Dependencies {
  val Scala = Seq(
    scalaVersion := "2.11.8"
  )

  // TESTING
  // PAWL Test Framework
  val pawlVersion           = "0.1.1-SNAPSHOT"// ApacheV2

  object Compile {
    object Test {
      private[Dependencies] val pawl       = "com.geeoz.pawl" %% "pawl-scalatest" % pawlVersion % "test"
    }
  }

  import Compile._

  private val l = libraryDependencies

  val test: Def.Setting[Seq[ModuleID]] = l ++= Seq(Test.pawl)
}