package loops

object NormalForLoop extends App{

     /*
       syntax format
       for (var i <- Range){ not need to use var explicitly
        statement which we want to execute
       }

       // Range can be provided using "to" and "untill" methods
      */
  println("***** to() *****")
  for (i <- 1 to 4){
    println("value to is = "+ i)
  }
  println("***** .to() *****")

  for (j <- 1.to(4)){
    println(s"value to is $j")
  }
  println("***** until() *****")
  for (k <- 1 until(4)) {
    println("value until k is = " + k) //last value skipped
  }
}
