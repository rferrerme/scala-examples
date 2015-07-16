import org.apache.hadoop.hbase.{HTableDescriptor, HBaseConfiguration}
import org.apache.hadoop.hbase.client.HBaseAdmin

object HBaseTables {

  def listTables(hbaseMaster: String): Array[HTableDescriptor] = {
    val conf =  HBaseConfiguration.create();
    conf.set("hbase.zookeeper.quorum", hbaseMaster);
    val admin = new HBaseAdmin(conf)
    admin.listTables()
  }

  def main(args: Array[String]): Unit = {
    val tables = listTables(hbaseMaster="hbase-master")
    tables.foreach(println)
  }
}
