package functions


// Scala program to illustrate the anonymous method
object AnnonymousFunction {

  def main(args: Array[String]) {

    var add = (x: Int, y: Int) => x + y       //Annonymous function ie. function without name

    println("Addition is- "+add(12, 34))


    def multiply(num1:Int=12,num2:Int=2):Int=num1*num2      //assigning default values to args of function multiply

    println("Multiplication is-"+multiply())
  }
}
