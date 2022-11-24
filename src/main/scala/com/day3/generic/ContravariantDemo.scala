package com.day3.generic

class Contravariant[-T](obj:T){
  override def toString: String = "Contravariant["+obj+"]"
}
object ContravariantDemo {

  def main(args: Array[String]): Unit = {
    val con1 =  new Contravariant[A](new A)
    val con2 = new Contravariant[B](new B)
    val con3 = new Contravariant[C](new C)

    processObjects(con1)
    processObjects(con2)
    processObjects(con3)

  }
  def processObjects(con : Contravariant[C]): Unit ={
  println(s"Processing objects $con")
  }
}
