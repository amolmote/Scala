package functions

/*
      It is an technique of transforming a function which takes multiple arguments into a function which
      takes a single argument.

 */
object CurryingFunction {

  def sum(a: Int,b: Int, c: Int):Int = a + b + c //this is the normal func

  def currySumFunc(a: Int) = (b : Int)=> (c: Int) => a + b + c //curryingFunc

  def curryFuncOtherWay (a: Int) (b: Int) (c: Int) = a + b + c


  def main(args: Array[String]): Unit = {
    println(sum(12,24,23))
    println(currySumFunc(12)(23)(24))
    println(curryFuncOtherWay(12)(23)(28))

  }
}

