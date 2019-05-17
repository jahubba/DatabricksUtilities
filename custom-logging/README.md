# Job log analytics
This is an example of processing logs at the job level using formatting found [here](https://github.com/jahubba/DatabricksUtilities/tree/master/src/main/scala/jahubba/databricks/spark/listener).  
1.  Clone and package the project
```sbt package```
2.  Move the jar to dbfs
3.  Update the init script with the location of the jar file just copied to dbfs
4.  Copy the init script to dbfs 
5.  Send cluster logs to a location within dbfs
6.  Add init script copied to dbfs to cluster
7.  Modify clusterLogsDir in notebook to point to cluster log location
