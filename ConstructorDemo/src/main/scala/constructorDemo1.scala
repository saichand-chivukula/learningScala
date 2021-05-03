
// In the below class i.e. class demoClass1 there is no parameters, so let us create the parameters
// Parameterised constructor is called primary constructor

class demoClass1(val a : Int, val b: Double, val c: String){
  val x = a
  val y = b
  val z = c

  def subNumber()={
    x - y
  }

  println(s"Subtraction of two numbers ${x} and ${y} is ${x-y}")
  println(s"X is ${a}, Y is ${b} , and Z is ${c}")
}


object constructorDemo1 {

  def main(args: Array[String]): Unit = {

    println("Welcome to Constructor Demo 1")

    val demoObj1 = new demoClass1(6, 6.4, "Sai")
    val demoObj2 = new demoClass1(7, 9.4, "Chand")

    var result = demoObj1.subNumber()
    println(s"Result is ${result}")

    result = demoObj2.subNumber()
    println(s"result is $result")


  }

}
