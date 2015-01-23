sbtPlugin := true

name := "lcamilo15-play-config"

organization := "com.lcamilo15"

// no javadoc
publishArtifact in (Compile, packageDoc) := false

sbtVersion in Global := {
  scalaBinaryVersion.value match {
    case "2.10" => "0.13.5"
    case "2.9.2" => "0.12.4"
  }
}

scalaVersion in Global := "2.9.2"

crossScalaVersions := Seq("2.9.2", "2.10.4")

scalacOptions ++= Seq("-unchecked", "-deprecation")

publishMavenStyle := false

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

