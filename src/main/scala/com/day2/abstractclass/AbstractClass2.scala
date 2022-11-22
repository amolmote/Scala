package com.day2.abstractclass


abstract class Animal{

  def canFly():Unit
  def canWalk():Unit
}

case class Bird() extends Animal{
  override def canFly(): Unit =  println("bird can fly")

  override def canWalk(): Unit = println("bird can walk")
}

class Dog extends Animal{
  override def canFly(): Unit = {
    println("dog can not fly")
  }

  override def canWalk(): Unit = println("dog can walk")
}
object AbstractClass2 {

  def main(args: Array[String]): Unit = {
    val obj1 = Bird()
    obj1.canFly()
    obj1.canWalk()

    val obj2 = new Dog
    obj2.canFly()
    obj2.canWalk()


  }

}
