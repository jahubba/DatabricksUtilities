ThisBuild / organization := "jahubba"
ThisBuild / scalaVersion := "2.11.8"

lazy val root = (project in file("."))
  .settings(
    name := "DatabricksUtilities",
    libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.4.1" % Provided
  )
