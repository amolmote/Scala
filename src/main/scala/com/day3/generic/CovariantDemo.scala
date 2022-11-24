package com.day3.generic

//Covariant Type[+A]: object A and subclass objects of A can be passed as an argument

class Covariant[+T](obj:T){
  override def toString: String = "Covariant["+obj+"]"
}
object CovariantDemo {

  def main(args: Array[String]): Unit = {

    val co1 = new Covariant[A](new A)
    val co2 = new Covariant[B](new B)
    val co3 = new Covariant[C](new C)
    processObj(co1)
    processObj(co2)
    processObj(co3)

  }
  def processObj(co: Covariant[A]): Unit ={
    println(s" processing objects $co")
  }

}
