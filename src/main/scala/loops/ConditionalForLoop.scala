package loops

object ConditionalForLoop extends App{
  val list:List[String] = List("amol","kajal","swapnil","ganesh")
  for { name <- list ; if name.contains("al")}{
    println(name)
  }
  println()
  //refractoring for loop
  for{ names <- list
       if names.contains("am")
       }{
    println(names)
  }
}
