// Default parameter in constructor
// In the below class i.e. class demoClass1 there is no parameters, so let us create the parameters
// Parameterised constructor is called primary constructor

class demoClass2(val a : Int = 99, val b: Double = 88.88, val c: String= "Hello Scala"){
  val x = a
  val y = b
  val z = c

  def subNumber()={
    x - y
  }

  println(s"Subtraction of two numbers ${x} and ${y} is ${x-y}")
  println(s"X is ${a}, Y is ${b} , and Z is ${c}")
}


object constructorDemo2 {

  def main(args: Array[String]): Unit = {

    println("Welcome to Constructor Demo 1")

    val demoObj1 = new demoClass2()


    var result = demoObj1.subNumber()
    println(s"Result is ${result}")


  }

}
