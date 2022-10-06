package array

object ArrayDemo {

  var array: Array[Int]= new Array[Int](4)

  def main(args: Array[String]): Unit = {
      array(0)=10
      array(1)=20
      array(2)=30
      array(3)=40

    for (x <- array){
      println(x)
    }

    //2nd way of printing
    for (i <- 0 until(array.length)){
      println(array(i))
    }
  }
}
