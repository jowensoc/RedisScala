ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "RedisScala",
    libraryDependencies ++= Seq(
      "redis.clients" % "jedis" % "5.0.2"
    )
  )
