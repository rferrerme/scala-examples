import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SparkCount {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkCount")
    // To use "yarn-client" set master in spark-submit
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)
    println(sc.parallelize(1 to 2000000000).count())
  }

}