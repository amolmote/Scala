package com.day3.generic

class Pair[T](firstObj:T,secondObj:T){

}
class A{

}
class B extends A{

}
class C extends B {

}
object GenericDemo2 {

  def main(args: Array[String]): Unit = {
    val o1 = new Pair[A](new A(),new B()) //can we can use new C() as a pair with A here
   // val o2 = new Pair[B](new A(),new B) this is not possible, child can not hold parent object
   val o2 = new Pair[B](new B,new C)
   val o3 = new Pair[C](new C,new C)


  }

}
