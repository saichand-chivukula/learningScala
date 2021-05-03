class demoClass{
  val x = 3    // var is mutable and val is immutable object, here the type is automatically infereed by Scala type inference
  val y = 2

  def addNumber()={
      x + y
  }

  println(s"x = ${x} and y = ${y}")
}


object constructorDemo {

  def main(args: Array[String]): Unit = {
    println("Constructor Demo Class!")

    // Creating a object - Instance of a class, when ever we create a object it calls the constructor
    // Constructor will execute everything in the class
    val demoObject = new demoClass

  }

}
