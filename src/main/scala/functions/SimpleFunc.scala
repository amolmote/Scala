package functions
//all ways of writing functions in scala
object SimpleFunc {

  //first way
  def addition(num1: Int, num2: Int):Int = {
    return num1  + num2
  }
  //second way -> need not to write return explicitly
  def addition1(num1: Int, num2: Int):Int ={
    num1 + num2
  }
  //third way -> need not to write return type as well
  def addition2(num1: Int,num2: Int) = {
    num1 + num2
  }
  //fourth way ->  single statement func can be written in single line only
  def addition3(num1:Int , num2: Int) = num1 + num2

   //fifth way -> printing output inside func directly (need to mention the "Unit" keyword it is mandatory if
   // we want to print output directly
  def addition4(num1: Int , num2: Int): Unit = println(num1 + num2)

  //sixth way -> assigning default values to function arguments
  def addSix(num1: Int = 10, num2: Int = 20) = num1 + num2


  def main(args: Array[String]): Unit = {
    println(addition(12,23))
    println(addition1(12,33))
    println(addition2(12,12))
    println(addition3(23,33))
    addition4(30,40)
    println(addSix())
    println(addSix(12))

  }
}
