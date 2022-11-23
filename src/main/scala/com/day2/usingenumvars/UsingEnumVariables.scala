package com.day2.usingenumvars

object UsingEnumVariables {

  def main(args: Array[String]): Unit = {
    import com.day2.enumdemo.Padding._   //_ means all variables are imported
    val current_padding = bottom_padding
    if (current_padding == bottom_padding) println("Using bottom padding as current")

    import com.day2.enumdemo.Padding

    Padding.values.foreach(println(_))   //getting all the declared group of variables in other package


  }
}
