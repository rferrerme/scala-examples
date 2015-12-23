object ScalaJsonHelloWorld {

  import spray.json._
  import DefaultJsonProtocol._

  def main(args: Array[String]) {
    val data /*: Map[String, Map[String, String]]*/ = Map("hello" -> Map("world" -> "!"))
    println(data.toJson)
  }
}

object ScalaJsonExample1 {

  import spray.json._
  import DefaultJsonProtocol._

  def main(args: Array[String]) {
    val data = Map("string" -> "1", "int" -> 1)
    // The following like won't compile! Go to ScalaJsonExample2
    /* println(data.toJson) */
  }
}

object ScalaJsonExample2 {

  import spray.json._
  import DefaultJsonProtocol._

  def main(args: Array[String]) {
    val data /*: Map[String, JsValue]*/ = Map("string" -> "1".toJson, "int" -> 1.toJson)
    println(data.toJson)
  }
}

object ScalaJsonExample3 {

  import spray.json._

  def main(args: Array[String]) {

    case class Record(id: Int, description: String)

    object MyJsonProtocol extends DefaultJsonProtocol {
      implicit val recordFormat = jsonFormat2(Record)
    }

    val record = Record(1, "description here")

    import MyJsonProtocol._
    println(record.toJson)
  }
}
