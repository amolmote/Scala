package com.day3.usingImplicit

object ImplicitTypeConversion {

  implicit def IntToStringConvert(a:Int):String=s"$a"
  def main(args: Array[String]): Unit = {
   /*
   This throws an error as we can not assign Int values into String variable we
   need to avoid this error using implicit type conversion.

    val a:Int = 30
    val str:String = a

    */
    val a:Int = 30
    val str:String = a
    println(str)
  }

}
