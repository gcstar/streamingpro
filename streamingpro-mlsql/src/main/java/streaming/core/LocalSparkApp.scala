package streaming.core

/**
  * Created by allwefantasy on 30/3/2017.
  */
object LocalSparkApp {
  /*
  mvn package -Ponline -Pcarbondata -Pbuild-distr -Phive-thrift-server -Pspark-1.6.1
   */
  def main(args: Array[String]): Unit = {
    StreamingApp.main(Array(
      "-streaming.master", "local[2]",
      "-streaming.name", "god",
      "-streaming.rest", "false",
      "-streaming.platform", "spark",
      "-streaming.enableHiveSupport", "true",
      "-streaming.spark.service", "false",
      "-streaming.enableCarbonDataSupport", "false",
      "-streaming.carbondata.store", "/data/carbon/store",
      "-streaming.carbondata.meta", "/data/carbon/meta",
      "-streaming.job.file.path", "classpath:///test/batch-mlsql.json"
    ))
  }
}