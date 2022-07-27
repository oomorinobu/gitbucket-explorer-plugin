organization := "io.github.gitbucket"
name := "gitbucket-explorer-plugin"
version := "9.0.1"
scalaVersion := "2.13.5"
gitbucketVersion := "4.37.2"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true
