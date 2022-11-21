package com.day1.functionalprogramming

object HigherOrderFunc3 {

  def main(args: Array[String]): Unit = {
    val sum1=higherOrderMaths(add,10,20)
    println(sum1)
    val sum2=higherOrderMaths((a,b)=>a+b,20,30)
    println(sum2)
    val sub1=higherOrderMaths(sub,20,10)
  }

  def add(a:Int, b:Int)=a+b
  def sub(a:Int,b:Int):Int=a-b
  def higherOrderMaths(f:(Int,Int)=>Int,a:Int,b:Int):Int=f(a,b)


}








