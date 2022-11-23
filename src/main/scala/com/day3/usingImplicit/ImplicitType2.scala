package com.day3.usingImplicit

/*
    Conversion of generic data types(Int, Float, Double) into String

 */
object ImplicitType2 {

  implicit def stringToInt[T](s:T):String = s"$s"

  def main(args: Array[String]): Unit = {

    val num1:Int = 20
    val s1:String  = num1
    println(s1)

    val num2:Double = 20.2234232
    val s2:String = num2
    println(s2)

    val num3:Char = 'c'
    val s3:String = num3
    println(s3)

    val num4:Float = 20.3f
    val s4:String = num4
    println(s4)
  }

}
