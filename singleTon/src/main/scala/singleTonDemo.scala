class DemoClassA(a:Int, b:Double){
  x = a
  y = b

  def addValue() = x+y

  println(s"X is ${x} and y is ${y}")


}



object singleTonDemo {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    var demoObjectA1 = new DemoClassA(3,2.2)
    var result = demoObjectA1.addValue()
    println(result)

    demoObjectA1 = new DemoClassA(4,2.2)
    result = demoObjectA1.addValue()
    println(result)

  }

}
