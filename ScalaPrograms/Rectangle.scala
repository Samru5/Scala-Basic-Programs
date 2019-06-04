package inheritance

object RectangleDemo extends App {

  class Rectangle(var width: Double, var height: Double) extends Polygon with Shape /*Polygon is abstract class
                                                                                                & Shape is trait so use with to add many traits so
                                                                                                  supports multiple inheritance */ {

    override def area: Double = width * height //area method from abstract class Polygon


    def color: String = "red" //color method from trait Shape
  }

}
