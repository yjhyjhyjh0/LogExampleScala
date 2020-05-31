# SimpleLogScala

Demo of log4j2+slf4j in scala

## FAQ

Q1-Is there any additional thing we need to do for using log4j2 for Scala?  
We need to import one additional log4j library “log4j-api-scala”  
https://jvz.github.io/log4j-scala-site/

"org.apache.logging.log4j" %% "log4j-api-scala" % "11.0”

Q2- Why does my log4j doesn’t trigger.  
One of my experence is mismatch of log4j-api-scala and log4j-core version.  
http://logging.apache.org/log4j/scala/dependency-management.html

"org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",  
"org.apache.logging.log4j" % "log4j-api" % "2.8.2",  
"org.apache.logging.log4j" % "log4j-core" % "2.8.2”,

Q3-Class path contains multiple SLF4J bindings.  
locate the dependency and exclude it’s sub log4j dependency   
https://www.baeldung.com/slf4j-classpath-multiple-bindings  
https://matthung0807.blogspot.com/2019/09/spring-boot-slf4j-class-path-contains.html

Q4-How to set log level for third party library?  
Take Apache spark for example:  
logger.org.apache.spark.name = org.apache.spark  
logger.org.apache.spark.level = warn  
logger.org.apache.spark.additivity = false  
logger.org.apache.spark.appenderRef.rolling.ref = RollingFile  
logger.org.apache.spark.appenderRef.stdout.ref = STDOUT  

https://stackoverflow.com/questions/50654206/log4j2-properties-tuning-to-set-a-specific-log-level-for-spark-only

## Reference

Logging trait in Apache Spark  
https://github.com/apache/spark/blob/e2ebca733ce4366349a5a25fe94a8e31b67d410e/core/src/main/scala/org/apache/spark/internal/Logging.scala

Discussion of scala logging  
https://stackoverflow.com/questions/2018528/logging-in-scala
