
//Program for List operations
object ListDemo extends App {

  //Eg-1
  val studentsData = List("John", "Alice", "Jenny")
  val age = Nil

  println(studentsData)

  println(studentsData.head)

  println(studentsData.tail)

  println(studentsData.isEmpty)

  println(age.isEmpty)

  //Eg-2
  case class Student(studentRollNo: Int, studentName: String, marks: Int)

  val studentInfo = List(Student(1, "Amey", 90), Student(2, "Priti", 40), Student(3, "Mohit", 80), Student(4, "Aakruti", 30))
  println(studentInfo)

  println(studentInfo.filter(stud => stud.marks >= 50)) //filters data according to condition

  println(studentInfo.partition(stud => stud.marks >= 50)) /*partitions data into 2 parts according to condition means
                                                          one containing marks>=50 and other contains marks<50*/

  println(studentInfo.reverse)
  //reverses the List

  val concatenation = List.concat(studentsData, studentInfo) //concatenates 2 lists of Eg-1 & Eg-2
  println(concatenation)

  //or
  val data = studentsData ::: studentInfo //concatenates 2 lists of Eg-1 & Eg-2
  println(data)

  val myInfo = studentsData.:::(studentInfo) //prints list of studentInfo first & then appends list of studentdsData
  println(myInfo)

}
