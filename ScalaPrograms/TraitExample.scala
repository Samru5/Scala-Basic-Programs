package inheritance

import inheritance.RectangleDemo.Rectangle

import inheritance.TraingleDemo.Traingle


trait Shape //trait is like interface in java
{
  def color: String //abstract method
}

abstract class Polygon //abstract class
{
  def area: Double //abstract method
}


object Polygon extends App {

  override def main(args: Array[String]) //override because main method is inside trait app
  {
    var rect = new Rectangle(20.00, 30.00)
    calculateArea(rect) //function call
    println("Color of rectangle is-" + rect.color)

    var triangle = new Traingle(100.00, 200.00)
    calculateArea(triangle) //function call
    println("Color of traingle is-" + triangle.color)


  }

  def calculateArea(p: Polygon) //function
  {
    println("Area is-" + p.area)
  }
}
