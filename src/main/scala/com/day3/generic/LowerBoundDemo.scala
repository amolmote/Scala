package com.day3.generic


class LowerBound[T>:A](obj:T){
  override def toString: String = "LowerBound["+obj+"]"
}
object LowerBoundDemo {

  def main(args: Array[String]): Unit = {
    val l1 = new LowerBound[A](new A)
    //val l2 = new LowerBound[B](new B)  //not valid only supertype of A can be instantiate
    println(l1)

  }
}
