package com.day3.usingImplicit

object ImplicitParameterInjection {

  def stringToIntParam(implicit s:String):Int = s.length

  def intToString(implicit a:Int):String = s"value is $a"

  def main(args: Array[String]): Unit = {
    val s:String = "Hello"
    println(stringToIntParam(s))

    val num:Int = 12
    println(intToString(num))

  }

}
