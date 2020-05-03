package temp

class MyNormalClass extends Logging {

  def testLoggingTrait(): Unit = {
    logInfo("hello logging trait info")
    logWarning("hello logging trait warn")
    logDebug("hello logging trait debug")
  }
}

object MyNormalClass {
  def main(args: Array[String]): Unit = {
    val myNormalClass = new MyNormalClass()
    myNormalClass.testLoggingTrait()
  }
}
