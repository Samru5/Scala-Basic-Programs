
object Tuples extends App{

  val list=(312,"Pooja",1,5,3,"John","Alice",2,8,6)
  val result = list._1
  println(result)

  //or
  val(part1,part2)=("Amey","Shravni")
  println(part1)
  println(part2)

//or

  val ingredient=("Sugar",25)
  println("Product is-"+ingredient._1)
  println("Price is-"+ingredient._2)

  //or

  val ingredients=new Tuple2("Butter",46)     //Tuple2 bcoz it contains 2 elements.Range for tuple ele is Tuple1-Tuple22
  println(ingredients._1)
  println(ingredients._2)

  //or
  val(name,price)=ingredients
  println("Product-"+name)
println("Price-"+price)
}
