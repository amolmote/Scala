package com.day3.usingImplicit

class A {

  def method1():Unit = println("method1 of class A")
}
class B{

  def method2():Unit = println("method2 of class B")

}
object ReceiverError {

  implicit def getInstanceOfBfromA(a:A):B={
    new B
  }

  implicit def getInstanceOfAFromB(b:B):A={
    new A
  }
  def main(args: Array[String]): Unit = {

    val obj1:A = new A
    obj1.method2() //-> this will return error as class A not having method2() so when we call like this
    //it should call implicit method which returns instance of B then we can avoid this error

    val obj2:B = new B
    obj2.method1()
  }

}
