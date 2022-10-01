package loops

object ReturnValueForLoop extends App{
  var numbers : List[Int] = List(1,2,3,4,7,8,9)
  var squares = for ( x <- numbers) yield {
    x * 2
  }
  println("squares = "+ squares)

  println("using some condition on above list")
  var results = for { y <- numbers
                      if y < 4
                      } yield {
    y * 3
  }
  println("cube = "+results)
}
