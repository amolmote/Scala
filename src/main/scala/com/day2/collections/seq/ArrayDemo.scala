package com.day2.collections.seq


/*
    Seq has two types of collection classes:
    1: Array- Mutable
    2: List- immutable
 */
object ArrayDemo {

  def main(args: Array[String]): Unit = {
     val arr:Array[Int] = Array(1,2,3,4,6)
    arr.foreach(a=>print("\t "+ a ))
    println()
    //inserting element at position fourth
    arr(4)=10
    arr.foreach(a=>print(" \t " +a))
  }
}
