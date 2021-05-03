class companionDemo{
  var x = 6

  def getValue(): Unit ={
    println(s"Value of x is ${x} and value of y is ${companionDemo.y}")
  }
}


object companionDemo {
  var y = 2.2
  def main(args: Array[String]): Unit = {
    println("Welcome to Companion Demo Class")

    val objectForCompanionDemoClass = new companionDemo()
    print(s"Value of x which is recieved from the Companion Demo class is ${objectForCompanionDemoClass.x} and y is ${y}")

    objectForCompanionDemoClass.getValue()
  }
}
