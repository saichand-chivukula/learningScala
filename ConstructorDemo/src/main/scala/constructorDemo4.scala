class demoClass4(val a:Int, val b:Double, val c:String){
  var x = a
  var y = b
  var z = c
  def addNum( ): Unit ={
    x+y
  }

  println(s"Addition of two numbers ${x} and ${y} is ${x+y}")
  println(s"Primary Constructor x is ${a}, y is ${b}, and z is ${c}")

  def this(){
    this(6,9.9, "Sai")
    println("I came into Auxiliary constructor with zero arguments")

  }
  def this(a:Int){
    this(a,9.9, "Sai")
    println("I came into Auxiliary constructor with one arguments")

  }
  def this(a:Int, b:Double){
    this(a,b, "Sai")
    println("I came into Auxiliary constructor with two arguments")

  }
}


object constructorDemo4 {

  def main(args: Array[String]): Unit = {

    println("Welcome to Constructor Demo 4 Class")

    val demoObj1 = new demoClass4(5, 7.2,"Chand" )
    val demoObj2 = new demoClass4( )
    val demoObj3 = new demoClass4(9 )
    val demoObj4 = new demoClass4(9,9.9)




  }
}
