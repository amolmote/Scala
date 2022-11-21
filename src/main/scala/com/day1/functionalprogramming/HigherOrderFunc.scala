package com.day1.functionalprogramming

object HigherOrderFunc {

  def main(args: Array[String]): Unit = {
    var sum=higherFunc((a,b)=>a+b,10,20)
    println(sum)
    
  }

  def add(a:Int,b:Int):Int=a+b
  def higherFunc(f:(Int,Int)=>Int,a:Int,b:Int):Int=f(a,b)

}
