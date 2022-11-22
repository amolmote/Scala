package com.day2.abstractclass


abstract class A{

  def greeting():Unit

}
class demo extends A{
  override def greeting(): Unit = println("hello, i am overridden method of abstract class")
}
object AbstractClassDemo extends App {  //App is an trait in scala having main method in it.
  val obj = new demo
  obj.greeting()
}
