package com.day1.curryingfunc

object CurryingFunc {

  def main(args: Array[String]): Unit = {

    val sum = addition1(10,20)
    println(sum)
    val f = addition2(20)
    println(f(20))

  }

  def addition1(a:Int,b:Int):Int = a + b
  def addition2(a:Int) = (b:Int) => a + b


}
