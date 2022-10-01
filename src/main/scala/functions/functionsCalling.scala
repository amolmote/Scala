package functions

import scala.language.postfixOps

//functions inside the scope of object can call directly without any reference of object

object functionsCalling {

  object InnerObject{
     def greet: Unit = println("hello amol")

    def square(x: Int):Int = x * x
  }

  def printHello:Unit = println("Hello Function")
  def main(args: Array[String]): Unit = {
    printHello
    //greet -> we can not call function directly this way because it has another scope of object
    InnerObject.greet
    InnerObject greet //for calling function this way we need "scala.language.postfixOps"

    println("one arg func calling "+ InnerObject.square(20))

    println(InnerObject square 20) //can be call in this way also it does not need any predefined package  it
    //it similar to "to" and "until" functions which we used in for loop
  }
}
