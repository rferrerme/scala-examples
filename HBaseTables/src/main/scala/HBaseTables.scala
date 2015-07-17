import org.apache.hadoop.hbase.{HTableDescriptor, HBaseConfiguration}
import org.apache.hadoop.hbase.client.HBaseAdmin

object HBaseTables {

  def listTables(zookeeperQuorum: String, zookeeperClientPort: String): Array[HTableDescriptor] = {
    val conf =  HBaseConfiguration.create()
    conf.set("hbase.zookeeper.quorum", zookeeperQuorum)
    conf.set("hbase.zookeeper.property.clientPort", zookeeperClientPort)
    val admin = new HBaseAdmin(conf)
    admin.listTables()
  }

  def main(args: Array[String]): Unit = {
    val tables = listTables(zookeeperQuorum="hbase-master", zookeeperClientPort = "2181")
    tables.foreach(println)
  }
}