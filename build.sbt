name := """SuWebsite"""

version := "1.0-SNAPSHOT"

<<<<<<< HEAD
lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
=======
lazy val root = (project in file(".")).enablePlugins(PlayJava)
>>>>>>> f4e750c6bf302b21f6edb0b3f1fdc2ccc03b0e5f

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
<<<<<<< HEAD
  evolutions,
=======
>>>>>>> f4e750c6bf302b21f6edb0b3f1fdc2ccc03b0e5f
  cache,
  javaWs
)
