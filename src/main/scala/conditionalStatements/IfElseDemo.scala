package conditionalStatements

object IfElseDemo extends App{

  var arr: Array[Int] = Array(1,2,3,4,6,7,8)
  val results = if (arr.length < 10){
    "short length array"
  }else{
    "too long array"
  }

  println(results)

  val res = for {x <- 0 until  arr.length} yield {
    arr(x)
  }
  println(res)
}
