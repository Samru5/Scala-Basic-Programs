

//Program of case class
//Eg-1
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

//Eg-2
object demo extends App{

  case class Employee(name:String,salary:Float)

  val emp=Employee("Seema",44000)

  println("Name is-"+emp.name)
  println("Salary is-"+emp.salary)

  val emp1=Employee("Jay",2000)

  println("Name is-"+emp1.name)
  println("Salary is-"+emp1.salary)

  val emp2=emp.copy()                     //creating copy of emp and storing in emp2
  println("Name -"+emp2.name)
  println("Salary -"+emp2.salary)

  val emp3=emp.copy(name="Tony")        //creating copy of emp and storing in emp3 only changing its name
  println("Name -"+emp3.name)
  println("Salary -"+emp3.salary)
}







