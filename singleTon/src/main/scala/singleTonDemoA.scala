object DemoClassB{ // Here it is defined as an object
  x = 2
  y = 4

  def addValue() = x+y

  println(s"X is ${x} and y is ${y}")


}



object singleTonDemo {

  def main(args: Array[String]): Unit = {
    println("Hello World")

   // val demoObjectB1 = new DemoClassB() - We cannot create a object from a object and it displays an error
   // val result = demoObjectB1.addValue() - We cannot use this because of the above object
    // println(result)
     print(DemoClassB.x, DemoClassB.y)

    var result = DemoClassB.addValue()
    println(result)

  }

}
