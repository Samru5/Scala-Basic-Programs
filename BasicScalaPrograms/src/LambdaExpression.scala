/**
  * Created by sashetye on 6/4/2019.
  */
object LambdaExpression extends App{
var nums=List(2,5,8,9,4,56,78)
  for(n <- nums)
    println(n)

//or
println("Numbers are-")
  nums.foreach{
    i:Int => println(i)         //lambda expression in scala denoted as =>
  }


}
