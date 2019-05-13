package jahubba.databricks.spark.listener

import org.apache.spark.sql.SparkSession
import org.apache.spark.scheduler.{SparkListener, SparkListenerJobStart}
import org.slf4j.LoggerFactory

class UserLoggerSparkListener extends SparkListener {
  private val logger = LoggerFactory.getLogger("UserActivity")
  
  override def onJobStart(jobStart: SparkListenerJobStart) {
    val applicationId = SparkSession.active.sparkContext.applicationId
    logger.info(s"Job ${jobStart.jobId} started by ${jobStart.properties.get("user")} with stages ${jobStart.stageIds.mkString(",")} and appId ${applicationId}")
  }
}
