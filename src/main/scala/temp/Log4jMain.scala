package temp

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class Log4jMain {

}

object Log4jMain {
  val log: Logger = LogManager.getLogger(classOf[Log4jMain])

  def main(args: Array[String]): Unit = {
    println("hello")
    log.info("hello log4j scala info")
    log.warn("hello log4j scala warn")
    log.debug("hello log4j scala debug")
  }
}
