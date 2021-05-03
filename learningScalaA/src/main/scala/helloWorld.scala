object helloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println("Hello World 1!")

    var result = addD(7,2)
    println("Adding two numbers x,y is :"+ result)

  }
//  To comment multiple lines of code we need to use cmd+/ in mac, cmd =ctrl in windows machine
  def add(x:Int, y:Int):Int = {
    var z = x + y
    return z
  }

  def addA(x:Int, y:Int):Int = {
    var z = x + y
    z     //Not mandatory to specify the return
  }

  def addB(x:Int, y:Int) = { // Not mandatory to specify the return type, it is automatically interpreted(type inference)
    var z = x + y
    z
  }

//  def addC(x:Int, y:Int) = { // If you specify return in the body of the function, we need to mention the return else we get error
//                                      // as addC variance has return statement need return type
//    var z = x + y
//    return z
//  }

  def addD(x:Int, y:Int) = x+y // If the function of single there is no need to mention "{ }"

  // Mandatory to specify Return Keyword - No
  // Mandatory to specify retun type - NO, what case it become mandatory- when we specify return keyword
  //Is it mandatory to give { } - No , when we write in a single line but we need to mention when we have multiple lines

}
