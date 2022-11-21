package com.day1.curryingfunc

object CurryingFunc2 {

  def main(args: Array[String]): Unit = {

    val y=x()
    val z=y(10)  //y takes x's func : y = a + 10
    println(z)

    //for invoking x1 in two different ways
   val func = x1()          //func is treated as function and func2 is treated as variable
    val func2 = func(20,3)
    println(func2)


    val func3 = x1()(20,3)
    println(func3)


  }

  def x():Int=>Int = {  //single variable func
    a=>a + 10    //the function which does not take any arguments but returns functions

  }

  def x1():(Int , Int)=>Int = {
    (a,b)=>a*b
  }
}
