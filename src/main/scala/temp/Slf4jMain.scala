package temp

import org.slf4j.LoggerFactory
import org.slf4j.Logger

class Slf4jMain {

}


object Slf4jMain {
  val log: Logger = LoggerFactory.getLogger(classOf[Slf4jMain])

  def main(args: Array[String]): Unit = {
    log.info("hello slf info")
    log.warn("hello slf warn")
    log.debug("hello slf debug")
  }
}

