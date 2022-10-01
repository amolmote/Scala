// Need not to mention the type but need to initialize when it declared

//Integer
var a : Int = 10
var b : Int = 20
val c = a + b
//Float
var  d = 20.3f
// Boolean
val con = true

//Double
val double = 20.4

//Array
var arr:AnyRef= Array(1,"amol",43,22)
var arr1:Array[Int] = Array(2,3,9)
//different ways to print array
arr1.foreach(println(_))
arr1.foreach(println)
arr1.foreach(a => println(a))

//sequence
var seqn: Seq[Int] = Seq(1,2,3,4)
seqn.foreach(println)
seqn.foreach(println(_))
