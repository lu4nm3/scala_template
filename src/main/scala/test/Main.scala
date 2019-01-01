package test

object Main {
  def main(args: Array[String]): Unit = {
    val test = new Test(3)
    println("Hello World!")
    println(s"times 2 ${test.timeTwo}")
  }
}
