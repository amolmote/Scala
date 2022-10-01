package loops

object WhileLoop{

  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 10) {
      println("x is= "+ x)
      x+=1
    }
  }
}
