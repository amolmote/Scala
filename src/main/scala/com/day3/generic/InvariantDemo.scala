package com.day3.generic
/*
    class A, B and C used from other file

 */
class Invariant[T](obj:T){
  override def toString: String = "Invariant["+obj+"]"
}
object InvariantDemo {

  def main(args: Array[String]): Unit = {

    val obj1 = new Invariant[A](new A)
    val obj2 = new Invariant[B](new B)
    val obj3 = new Invariant[C](new C)

    //Invariant: Only Type[A] can be passed as an argument

    processObjects(obj1)
   // processObjects(obj2)  Not valid
    //processObjects(obj3)  Not valid

  }
  def processObjects(obj1:Invariant[A]){
    println(s"processing object: $obj1") //will call above toString method
  }
}
