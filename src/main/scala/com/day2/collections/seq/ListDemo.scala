package com.day2.collections.seq

object ListDemo extends App{

  val list:List[Int] = List(1,2,3,4)
  println("foreach: iterate over the collection")
  list.foreach(a=>print(s"$a "))


  //map() is used to transform one collection into other
  println("map(): transform one collection into other")
  list.map(a=>a*2).foreach(b=>print(s"$b "))

  println("reduce(): performing math operation over the elements")
  list.reduce((a,b)=>{
    println(s"adding $a with $b")
    a + b
  })
  println("fold(): same as reduce except it provide initial value")
  list.fold(2)((a,b)=>{
    println(s"$a added with $b")
    a + b
  })

}
