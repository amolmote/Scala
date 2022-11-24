package com.day3.generic

class A1{

}
class A2 extends A1{

}
class A3 extends A2{

}
object RuntimePolymorphismRuleTest {

  def main(args: Array[String]): Unit = {

    var a1 = new A1()
      a1 = new A2() // valid
      a1 = new A3() // valid

    var a2 = new B()
        //a2 = new A() //not valid
        a2 = new C()

    val a3 = new C()


  }

}
