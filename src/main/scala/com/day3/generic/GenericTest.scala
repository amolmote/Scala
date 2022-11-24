package com.day3.generic


class Pairs[T](first:T,second:T){
  override def toString: String = "Pairs[first= "+first+" second= "+second+"]"
}
object GenericTest {

  def main(args: Array[String]): Unit = {

    val p1 = new Pairs[Int](10,20)
    val p2 = new Pairs[String]("Amol","KP")

    println(p1)
    println(p2)
  }

}
