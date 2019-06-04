

//Program of case class
object CaseClassDemo extends App {

  case class Employee(empId: Int, empName: String, empSalary: Float)

  //acts like parameterized constructor

  val emp = Employee(101, "John", 45000f) //emp is object reference
  println(emp)

  println(emp.empId)
  println(emp.empName)
  println(emp.empSalary


  )


}






