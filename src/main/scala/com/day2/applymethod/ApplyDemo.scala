package com.day2.applymethod


object Test{
  //we can have n number of apply() methods in one class/object
  def apply():Unit = println("default apply method")
  def apply(a:Int):Unit = println("parameterized apply method "+a)

}
object ApplyDemo {

  def main(args: Array[String]): Unit = {
        val obj = Test
        obj.apply()
        obj.apply(30)

  }
}
