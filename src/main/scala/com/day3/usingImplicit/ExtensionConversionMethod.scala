package com.day3.usingImplicit

object ExtensionConversionMethod {

  implicit class convertor(meters:Int){
    def metersToKm():Float = meters / 1000

  }
  implicit class conv(km:Int){
    def kmToMeters():Int = km * 1000
  }
  def main(args: Array[String]): Unit = {
    val meters:Int = 2000
    println(meters.metersToKm())

    val km:Int = 20
    println(km.kmToMeters())
  }
}
