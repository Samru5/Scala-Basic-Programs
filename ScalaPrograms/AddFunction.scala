

//Program to perform addition of 2 numbers
object AddFunction extends App {

  println("Enter first number-")
  var number1 = scala.io.StdIn.readInt() //input from user

  println("Enter second number-")
  var number2 = scala.io.StdIn.readInt() //input from user

  def addition(num1: Int, num2: Int): Int = num1 + num2 //addition function.def is used to define/declare function


  println("Addition is-" + addition(number1, number2)) //function call

}

