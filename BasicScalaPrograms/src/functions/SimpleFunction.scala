package functions

object demo {

  object Math {

    def add(x: Int, y: Int): Int = x + y;

    def square(num: Int): Int = num * num

    def /(x: Int, y: Int): Int = x / y           //operator / is used as function name
  }

  def add(x: Int, y: Int): Int = x + y;

  def multiply(x: Int, y: Int): Int = x * y;

  def %(x: Int, y: Int): Int = x % y                      //operator % is used as function name

  def main(args: Array[String]) {
    println("Addition method of Math object-"+Math.add(4, 7))                               /*method inside Math Object so call
                                                           it directly using Math object withot creating it using new keyword*/
    println("Square method of Math object-"+Math.square(9))

    //or
    println( Math square 9)                            //only one arg then can write like this

    println("Division method of Math object-"+Math./(12, 2))                            //calling function / using Math object

    println("Addition is-"+add(9, 6))
    println("Multiplication is-"+multiply(2, 5))
    println("Modulus is-"+ %(10, 2))                                     //calling % function using % operator


    //Apply method is default method of class/object

    val myList=List(1,2,3,4,5)
   println(myList(1))     //gives element present at index 1

    //or
    println(myList.apply(1))      //gives element present at index 1

  }

}
