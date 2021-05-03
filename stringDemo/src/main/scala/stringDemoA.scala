import jdk.jshell.tool.JavaShellToolBuilder

object stringDemoA {

  def main(args: Array[String]): Unit = {
    var greetings = "Hello, welcome to StringDemoA Class"
    println(greetings)
    var greetings_new: String  = "Please check with you"
    println(greetings_new)

    // Method to get length of the string
    var greeting_length = greetings.length( ) // Any method i.e. length() used to get information of an object is called accessor method
    println(s"Length of String is: ${greeting_length}")

    //concat( )
    var var1 = "Hello"
    var var2 = "World!"
    println(var1 + var2)
    println(var1.concat(var2))

    //equals( )
    var varA = "Hello World!"
    var varB = "Hello World!"
    println(varA.equals(varB))
    println(varA == varB) // same as equals( ) but it does one more additional task i.e. varA and VarB are null or not

    println(varA.isEmpty)

    //String formatting
    var nameOfCar = "Merc"
    var costOfCar = 50000
    var mileage = 8.5

    printf("Name of car is %s, cost of the car is %d, and mileage is %f", nameOfCar, costOfCar, mileage)

    //Multi Line strings
    println(" ")
    var multiLineString =
      """ Hello
        |world
        |How
        |are
        |you
        |""".stripMargin
  println(multiLineString)

    println(" ")
    var multiLineStringA =
      """ Hello
        world
        How
        are
        you
        """
    println(multiLineStringA)

    //String Interpolation - Implemented from Scala 2.10
    // S String Interpolator
    var name = "SaiChand"

    println("Hello"+ name) // using + to concat
    println(s"Hello $name")// using s interpolator widely used

    // f Interpolator
    var nameA = "Chivukula"
    var salary = 20000.20

    println(f"Name is $nameA%s and salary is $salary%8.2f")

    //raw interpolator - same as S interpolator but does not perform escaping  -\n, \t
    println(s"Hello World! \n How are you?")
    println(raw"Hello World! \n How are you?")



  }
}
