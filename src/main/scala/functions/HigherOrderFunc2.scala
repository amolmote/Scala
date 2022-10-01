package functions

object HigherOrderFunc2 {

  def maths(a: Int, b: Int, c: Int, f:(Int,Int)=>Int):Int= f(f(a, b),c)

  def main(args: Array[String]): Unit = {
     println(maths(10,20,30,(x,y) => x + y))
    //using "_" as a something value
    println(maths(20,30,40, _ + _))
    println(maths(1,2,3,_ max _))
    println(maths(1,2,3, _ min _))
    println(maths(1,2,3,_ - _))


  }
}
