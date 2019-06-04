//Program for Map operations
object MapDemo extends App {
  var students=Map(1 -> "John",2 -> "Monika",3 -> "Sarita")

  val marks:Map[String,Int]=Map("marks1" -> 80,"marks2" -> 40,"marks3" -> 98)

  println(students.keys)      //returns keys
  println(students.values)    //returns values
  println(students.isEmpty)   //checks Map is empty or not


  println(marks.keys)           //returns keys
  println(marks.values)           //returns values
  println(students.isEmpty)       //checks Map is empty or not

val concatination=students ++ marks     //concatenates 2 maps
  println(concatination)

  //or
  val concatination1=students. ++(marks)    //concatenates 2 maps
  println(concatination1)


  students.keys.foreach{              //prints keys and values
    i =>println("Key is "+i)
      println("Value is"+students(i))
  }

  if(students.contains(1))        //checks key=1 is present or not
    println("This key is present")

  println(students(3))          //prits value present at key=3

  students +=(4 -> "Ajay")    //adds this element into map
  println(students)

  students -=4              //removes element having key=4
  println(students)
}
