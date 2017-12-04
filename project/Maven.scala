import sbt.Keys._
import sbt._

object Maven {
  val settings = Seq(
    resolvers ++= Seq(
      Resolver.sonatypeRepo("snapshots"),
      Resolver.bintrayRepo("geeoz", "mvn")
    )
  )
}