

//Program performing pattern matching using case
object CalculatorPatternMatching extends App {

  def addition(num1: Int, num2: Int): Int = num1 + num2

  def subtraction(num1: Int, num2: Int): Int = num1 - num2

  def multiplication(num1: Int, num2: Int): Int = num1 * num2

  def division(num1: Int, num2: Int): Int = num1 / num2

  def modulus(num1: Int, num2: Int): Int = num1 % num2


  println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus")
  println("Enter your choice-")

  var choice = scala.io.StdIn.readInt() //input from user

  choice match {
    //Pattern Matching

    case 1 =>
      println("Enter first number-")
      var number1 = scala.io.StdIn.readInt()
      println("Enter second number-")
      var number2 = scala.io.StdIn.readInt()
      println(addition(number1, number2)) //function call

    case 2 =>
      println("Enter first number-")
      var number1 = scala.io.StdIn.readInt()
      println("Enter second number-")
      var number2 = scala.io.StdIn.readInt()
      println(subtraction(number1, number2)) //function call

    case 3 =>
      println("Enter first number-")
      var number1 = scala.io.StdIn.readInt()
      println("Enter second number-")
      var number2 = scala.io.StdIn.readInt()
      println(multiplication(number1, number2)) //function call


    case 4 =>
      println("Enter first number-")
      var number1 = scala.io.StdIn.readInt()
      println("Enter second number-")
      var number2 = scala.io.StdIn.readInt()
      println(division(number1, number2)) //function call

    case 5 =>
      println("Enter first number-")
      var number1 = scala.io.StdIn.readInt()
      println("Enter second number-")
      var number2 = scala.io.StdIn.readInt()
      println(modulus(number1, number2)) //function call

    case _ => println("Invalid choice") //underscore means anything

  }
  
  //Eg-2
  
  def data(s:String):String=s match{
    case "Hello" =>"Hello"
    case "Hi" =>"Hi"
    case _ =>"Not valid"
  }
println(data("Hello123"))

}
