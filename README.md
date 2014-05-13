__Follow the instructions below to get IntelliJ to work with sbt__

1. From this project's plugins.sbt file, copy the first two lines and place them in your project's plugins.sbt file.

  ```Scala
  resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
  
  addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0-SNAPSHOT")
  ```

2. In your build.sbt file type

  ```Scala
  ideaExcludeFolders ++= Seq(
    ".idea", ".idea_modules", ".settings"
  )
  ```

3. Open a command terminal and navigate to your current project's folder
4. Type in

  ```
  sbt gen-idea
  ```

5. In IntelliJ it helps to download and install the following plugins
  * SBT
  * SBT Executor
  * Scala
