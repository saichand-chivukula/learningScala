class demoClass3(val a:Int = 6, val b:Double = 9.9, val c:String = "Hello Sai"){
  var x = a
  var y = b
  var z = c
  def addNum( ): Unit ={
    x+y
  }

  println(s"Addition of two numbers ${x} and ${y} is ${x+y}")
  println(s"x is ${a}, y is ${b}, and z is ${c}")

}


object constructorDemo3 {

  def main(args: Array[String]): Unit = {

    println("Welcome to Constructor Demo 3 Class")

    val demoObj1 = new demoClass3( )
    val demoObj2 = new demoClass3(9)
    val demoObj3 = new demoClass3(5, 7.2, "Chand")


  }
}
