# SparkCount
Parallelize the count from 1 to 2000000000 using Spark.

Master is hardcoded to `local[*]`.

If you have a YARN cluster available and you want to try there, remove `conf.setMaster("local[*]")` from the source code and use `spark-submit`:

* Generate the JAR file using `sbt package`
* Provide `YARN_CONF_DIR`, main class, JAR and choose `yarn-client` or `yarn-cluster`. For example:
    * `YARN_CONF_DIR=/opt/hadoop/etc/hadoop/ /opt/spark/bin/spark-submit --class SparkCount --master yarn-client sparkcount_2.10-1.0.jar`