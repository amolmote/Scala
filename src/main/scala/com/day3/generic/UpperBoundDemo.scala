package com.day3.generic


class UpperBound[T<:A](obj:T){
  override def toString: String = "UpperBound["+obj+"]"
}
object UpperBoundDemo {

  def main(args: Array[String]): Unit = {
// A and Subclasses of A can be instantiated
    val o1 = new UpperBound[A](new A)
    val o2 = new UpperBound[B](new B)
    val o3 = new UpperBound[C](new C)

    println(o1)
    println(o2)
    println(o3)

  }
}
