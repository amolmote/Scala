package functions

object UsingOperatorForFunctionName {

  def ***(a: Int, b: Int, c: Int): Int = a * b * c

  def ++(n1: Int, n2: Int):Int = n1 + n2

  def $(num: Int):Int = num * num

  def main(args: Array[String]): Unit = {
    println(***(2,2,2))
    println(++(20,30))
    println($(20))
  }
}
