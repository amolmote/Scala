
object MatchExpression extends App{

     var number = 100
  number match {
    case 10 => println(10)
    case 20 => println(20)
    case 30 => println(30)
    case _ => println("match not found")
  }

  //other way directly return value
   val index = 33
  val res = index match {
    case 11 => 11
    case 22 => 22
    case 33 => 33
    case _ => "default case"

  }
  println(res)
}
