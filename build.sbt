ThisBuild / organization := "jahubba"
ThisBuild / scalaVersion := "2.11.8"

lazy val customLogging  = (project in file("custom-logging"))
  .settings(
    name := "custom-logging",
    libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.4.1" % Provided
  )
