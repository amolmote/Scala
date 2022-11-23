package com.day2.traitDemoPkg


trait Animal{

  def canRun():Unit
  def canFly():Unit

}

trait Food{
  def fishLover():Unit
}
class Cat extends Animal with Food {
  override def canRun(): Unit = println("Cat Can Run")

  override def canFly(): Unit = println("Cat can not Fly")

  override def fishLover(): Unit = println("Can loves fish to eat")
}
object TraitDemo {
  def main(args: Array[String]): Unit = {
    val c:Animal = new Cat
    c.canFly()
    c.canRun()

    val e:Food = c.asInstanceOf[Food]   //create the instance referring to the same as Animal
    e.fishLover()


  }
}
