import Dependencies._

import org.typelevel.scalacoptions.ScalacOptions

lazy val scala212Version = "2.12.18"

lazy val scala213Version = "2.13.12"

lazy val scala3Version = "3.3.1"

lazy val supportedScalaVersions = Seq(scala212Version, scala213Version, scala3Version)

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion         := scala213Version
ThisBuild / organization         := "com.karadzhov"
ThisBuild / organizationName     := "Karadzhov"
ThisBuild / organizationHomepage := Some(url("https://www.karadzhov.com"))
ThisBuild / developers := List(
  Developer(
    id = "karadzhov",
    name = "Petar Karadzhov",
    email = "petar@karadzhov.com",
    url = url("https://www.karadzhov.com")
  )
)
ThisBuild / licenses               := List("The Unlicense" -> url("https://unlicense.org/"))
ThisBuild / homepage               := Some(url("https://github.com/karadzhov/scala-iso-language"))
ThisBuild / versionPolicyIntention := Compatibility.BinaryAndSourceCompatible
// Ignore dependencies to internal modules whose version is like `1.2.3+4...`
ThisBuild / versionPolicyIgnoredInternalDependencyVersions := Some("^\\d+\\.\\d+\\.\\d+\\+\\d+".r)
ThisBuild / sonatypeCredentialHost                         := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository                             := "https://s01.oss.sonatype.org/service/local"
ThisBuild / scalafixDependencies                          ++= Seq(Libraries.scalafixScaluzzi)
ThisBuild / semanticdbEnabled                              := true
ThisBuild / semanticdbVersion                              := scalafixSemanticdb.revision

lazy val root = project
  .in(file("."))
  .aggregate(
    `scala-iso-language-core`.js,
    `scala-iso-language-core`.jvm,
    `scala-iso-language-core`.native,
    `scala-iso-language-i18n-core`.js,
    `scala-iso-language-i18n-core`.jvm,
    `scala-iso-language-i18n-core`.native,
    `scala-iso-language-i18n-bg`.js,
    `scala-iso-language-i18n-bg`.jvm,
    `scala-iso-language-i18n-bg`.native,
    `scala-iso-language-i18n-en`.js,
    `scala-iso-language-i18n-en`.jvm,
    `scala-iso-language-i18n-en`.native,
    `scala-iso-language-i18n-de`.js,
    `scala-iso-language-i18n-de`.jvm,
    `scala-iso-language-i18n-de`.native
  )
  .settings(
    crossScalaVersions := Nil,
    publish / skip     := true
  )

lazy val `scala-iso-language-core` = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("modules/scala-iso-language-core"))
  .settings(
    Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement,
    // IMPORTANT: Include all transitive dependencies explicitly, otherwise there will be strange runtime exceptions
    libraryDependencies ++= Seq(
      "com.beachape"  %%% "enumeratum" % V.enumeratum,
      "org.scalactic" %%% "scalactic"  % V.scalaTest % Test,
      "org.scalatest" %%% "scalatest"  % V.scalaTest % Test
    ),
    crossScalaVersions := supportedScalaVersions
  )

lazy val `scala-iso-language-i18n-core` = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("modules/scala-iso-language-i18n-core"))
  .dependsOn(`scala-iso-language-core`)
  .settings(
    Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement,
    crossScalaVersions            := supportedScalaVersions
  )

lazy val `scala-iso-language-i18n-bg` = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("modules/scala-iso-language-i18n-bg"))
  .dependsOn(`scala-iso-language-i18n-core`)
  .settings(
    Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement,
    // IMPORTANT: Include all transitive dependencies explicitly, otherwise there will be strange runtime exceptions
    libraryDependencies ++= Seq(
      "org.scalactic" %%% "scalactic" % V.scalaTest % Test,
      "org.scalatest" %%% "scalatest" % V.scalaTest % Test
    ),
    crossScalaVersions := supportedScalaVersions
  )

lazy val `scala-iso-language-i18n-en` = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("modules/scala-iso-language-i18n-en"))
  .dependsOn(`scala-iso-language-i18n-core`)
  .settings(
    Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement,
    // IMPORTANT: Include all transitive dependencies explicitly, otherwise there will be strange runtime exceptions
    libraryDependencies ++= Seq(
      "org.scalactic" %%% "scalactic" % V.scalaTest % Test,
      "org.scalatest" %%% "scalatest" % V.scalaTest % Test
    ),
    crossScalaVersions := supportedScalaVersions
  )

lazy val `scala-iso-language-i18n-de` = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("modules/scala-iso-language-i18n-de"))
  .dependsOn(`scala-iso-language-i18n-core`)
  .settings(
    Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement,
    // IMPORTANT: Include all transitive dependencies explicitly, otherwise there will be strange runtime exceptions
    libraryDependencies ++= Seq(
      "org.scalactic" %%% "scalactic" % V.scalaTest % Test,
      "org.scalatest" %%% "scalatest" % V.scalaTest % Test
    ),
    crossScalaVersions := supportedScalaVersions
  )

addCommandAlias(
  "sourceCodeCheck",
  "; scalafmtSbtCheck; scalafmtCheckAll; Compile / scalafix --check; Test / scalafix --check; test"
)

addCommandAlias("sourceCodeFix", "; Compile / scalafix; Test / scalafix; scalafixAll; scalafmtSbt; scalafmtAll")

addCommandAlias("updates", "; dependencyUpdates; reload plugins; dependencyUpdates; reload return")
