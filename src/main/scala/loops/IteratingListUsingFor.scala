package loops

object IteratingListUsingFor extends  App {
  var list: List[Int] = List(21,11,3,2,1,24,32,99)
  for (i <- list){
    println(i)
  }
}
