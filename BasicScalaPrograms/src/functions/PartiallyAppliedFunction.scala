package functions

import java.util.Date

object PartiallyAppliedFunction {

  def multiply(num1: Int, num2: Int = 9): Int = num1 * num2
  println("Multiplication is-" + multiply(8))   /*default value is assigned to num2 so can pass only one arg during calling
                                                  but if num1=8 bydefault then can,t pass only one args*/


//  def multiply(num1: Int=9, num2: Int): Int = num1 * num2
//  println("Multiplication is-" + multiply(8))                error

  println("Multiplication is-" + multiply(6,5))     //new values are assigned to num1 and num2

  def log(date: Date, message: String) = {
    println(date + " " + message)
  }

  def main(args: Array[String]) {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)
    println("Addition of a,b,c is-" + f(20, 30))

    val date = new Date
    val newLog = log(date, _: String)
    newLog("Message 1")
  }


}


