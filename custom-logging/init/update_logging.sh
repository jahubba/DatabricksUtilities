
#!/bin/bash
echo "log4j.appender.console.layout.ConversionPattern=%d{yy/MM/dd HH:mm:ss}^%t^%p^%c{1}^%m%n" >> /home/ubuntu/databricks/spark/dbconf/log4j/executor/log4j.properties
echo "log4j.appender.publicFile.layout.ConversionPattern=%d{yy/MM/dd HH:mm:ss}^%t^%p^%c{1}^%m%n" >> /home/ubuntu/databricks/spark/dbconf/log4j/driver/log4j.properties
cp -f /dbfs/databricks/init/jahubba-test/custom-logging_2.11-0.1.0-SNAPSHOT.jar /mnt/driver-daemon/jars || { echo "Error copying file"; exit 1;}
cat << EOF > "/databricks/driver/conf/00-custom-listeners.conf"
[driver] {
    "spark.extraListeners" = "com.databricks.backend.daemon.driver.DBCEventLoggingListener,jahubba.databricks.spark.listener.UserLoggerSparkListener"
}
EOF
