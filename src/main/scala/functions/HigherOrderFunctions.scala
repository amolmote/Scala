package functions

// Higher Order Function-> The function which takes another function as an argument
 // and return function as a output

object HigherOrderFunctions {

  def mathematicalFunc(num1: Int, num2: Int, f:(Int, Int) => Int):Int = f(num1,num2)

  def main(args: Array[String]): Unit = {

    println(mathematicalFunc(12,12,(x,y )=> x + y))

  }

}
