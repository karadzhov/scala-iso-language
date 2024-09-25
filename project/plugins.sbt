ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

addSbtPlugin("ch.epfl.scala"      % "sbt-scalafix"                  % "0.12.1")
addSbtPlugin("ch.epfl.scala"      % "sbt-version-policy"            % "3.2.1")
addSbtPlugin("com.github.sbt"     % "sbt-ci-release"                % "1.6.1")
addSbtPlugin("com.timushev.sbt"   % "sbt-updates"                   % "0.6.4")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.16.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.17")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"                  % "2.5.2")
addSbtPlugin("org.typelevel"      % "sbt-tpolecat"                  % "0.5.2")
