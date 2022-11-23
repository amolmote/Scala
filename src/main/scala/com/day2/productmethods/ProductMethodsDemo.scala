package com.day2.productmethods

/*
    Product trait contains these methods: productArity, productElement, productIterator

    case classes by default contains these 4 methods: equals, productArity, productElement, productIterator
 */
case class Employee(emp_id:Int, emp_name:String, emp_designation:String)

object ProductMethodsDemo {

  def main(args: Array[String]): Unit = {
    val emp = Employee(101,"Rahul","production engineer")

    println(emp.productArity) //returns no of arguments
    println(emp.productElement(2)) //get the element at specified position
    emp.productIterator.foreach(a=>println(a))  //iterate over the all arguments

  }

}
