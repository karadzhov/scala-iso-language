import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {

  object V {

    lazy val enumeratum = "1.7.3"

    lazy val scalaTest = "3.2.18"

    lazy val scalafixScaluzzi = "0.1.23"

  }

  object Libraries {

    lazy val scalafixScaluzzi = "com.github.vovapolu" %% "scaluzzi" % V.scalafixScaluzzi

  }

}
