package com.luis

import sbt._
import Keys._
import io.Source
import java.io.{FileReader, InputStreamReader}

object SbtConfigPlugin extends Plugin {

    lazy val sampleIntTask = TaskKey[Unit]("install", "Installs projects using configuration parameters")

    val sbtConfigSettings : Seq[Project.Setting[_]] = Seq(
        sampleIntTask := {
            val sum = 1 + 2
            println("sum: " + sum)
            sum
        }
    )
}

class BundledLibraryReaderFactory(resourcePath: String) {
    lazy val cl = this.getClass.getClassLoader
    def reader = new InputStreamReader(cl.getResourceAsStream(resourcePath))
}
