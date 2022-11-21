package com.day1.functionalprogramming

object HigherOrderFunc2 {

  def main(args: Array[String]): Unit = {

    val result=func(name=>"my name is "+name,s=>s.length,"amol")
    println(result)

  }

  def func(f:String=>String,g:String=>Int,s:String)=f(s)+" "+g(s)


}
