package functions

object SimpleHigherOrderFunc {


    def shortName(n1: String, n2: String,f:(String,String)=> String):String = f(n1,n2)
    def fullName(n1: String, n2: String, n3: String,f:(String,String,String)=> String):String= f(n1,n2,n3)
    def fullName1(n1: String, n2:String,n3:String, f:(String,String) => String): String = f(f(n1,n2),n3)

  def main(args: Array[String]): Unit = {

    println(shortName("amol","mote",(a , b)=> a + " " + b))
    println(fullName("amol","balasaheb","mote",_ + " " + _ + " " + _ ))
    println(fullName1("amol","balasaheb","mote",_ + " " + _))

  }

}
