val build = taskKey[Unit]("Project full build task.")

lazy val buildSettings = Dependencies.Scala ++
  Maven.settings ++ Seq(
    build := {},
    build := {
      Seq(
        (clean in Compile).value,
        (compile in Compile).value,
        (test in Test).value
      )
    }
  )

lazy val `example-assembly` = (project in file(".")).
  aggregate(
    `example-e2e-web-tests`
  )

lazy val `example-e2e-web-tests` = (project in file("example-e2e-web-tests")).
  enablePlugins(PawlPlugin).
  settings(buildSettings: _*).
  settings(
    name := "example-e2e-web-tests",
    Dependencies.test
  )
