name := "ScalaExamples"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Apache HBase" at "https://repository.apache.org/content/repositories/releases"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-client" % "2.4.1",
  "org.apache.hbase" % "hbase-common" % "0.98.11-hadoop2",
  "org.apache.hbase" % "hbase-client" % "0.98.11-hadoop2"
)
    