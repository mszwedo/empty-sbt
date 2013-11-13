name := "sbtDemo"
 
version := "0.0.0"
  
scalaVersion := "2.10.2"

ideaExcludeFolders ++= Seq(
  ".idea", ".idea_modules", ".settings"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"
)

