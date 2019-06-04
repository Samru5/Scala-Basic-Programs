package functions


object HigherOrderFunction {
  //In higher order function we can pass function as argumnet as well as we can retirn the function

  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)       //with 2 args

  def math1(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)     //with 3 args


  def main(args: Array[String]) {

    //for 2 args
    val result = math(50, 20, (x, y) => x + y)
    println("Addition is-" + result)

    val result1 = math(50, 20, (x, y) => x min y)
    println("Minimum is-" + result1)

    val result2 = math(50, 20, (x, y) => x max y)
    println("Maximum is-" + result2)


    //for 3 args

    val newResult = math1(50, 20, 10, (x, y) => x + y)
    println(newResult)



    val newResult2 = math1(50, 20, 10, (x, y) => x * y)
    println(newResult2)


  }
}
