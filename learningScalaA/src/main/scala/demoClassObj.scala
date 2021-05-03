// Access levels in Scala = Public- Can access anywhere(by default any class is public)
// Private - Can access only in the class it is defined
// Protected - Can access in class it is defined as well as in sub class extending the given class using inheritance


class car{
  //Collection of variables and functions is called class

  var topClassExtraCost = 0
  private var roadTax = 100
// If i Use private as an access modifier then we can only access the roadTax variable inside the class Car and cannot be used outside
  protected  var xyz = 10

  def cost(basicCost:Int)= basicCost+topClassExtraCost+roadTax

  // If a function is defined inside a class is called as method
  def checkTax()={
     var a = roadTax
    roadTax = 10 // Unintentional change by programmer
    a
  }

}

class smallCar extends car{
  println(xyz)
  // xyz will not gives any error because it is a protected where it can be used in extended class also
  // println(roadTax)
  // but roadTax will give you the error because it is private and it can not be used outside the class it is declared
}

// To use the above class we need to create an object


object demoClassObject {

  def main(args: Array[String]): Unit = {

    // Creating an object to access the variables and methods inside the class
    var bmw = new car
    //println(bmw.roadTax)
   // bmw.roadTax = 200
    //println(bmw.roadTax)
    bmw.topClassExtraCost = 500
    var result = bmw.cost(basicCost = 10000)
    println("Total cost of Car is:"+ result)
  // Method with Side effects
    println("RoadTax is :" + bmw.checkTax())

  }

}




