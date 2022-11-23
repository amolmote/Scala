package com.day2.collections.seq

object JaggedArray {

  def main(args: Array[String]): Unit = {

    val arr:Array[Array[Int]] = Array(
      Array(2,3),
      Array(4,6,7),
      Array(4,8,9)
    )
    arr.foreach(a=>{
      println()
      a.foreach(x=>print(s"$x \t"))
    })
  }

}
