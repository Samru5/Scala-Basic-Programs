/**
  * Created by sashetye on 6/4/2019.
  */
object CheckObjectData extends App{

  case class Student(id:Int=1,name:String="John",marks:Int=89) {

    def >(s2: Student): Boolean = marks > s2.marks      // > is used as fumction name
  }
  var s1=Student()
  var s2=Student(2,"Minal",56)

  println(s1.>(s2))               //s1 & s2 gets check according to their marks

}
