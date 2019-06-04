package inheritance


object TraingleDemo extends App {

  class Traingle(base: Double, height: Double) extends Polygon with Shape /*Polygon is abstract class
                                                                          & Shape is trait so use with to add many traits so
                                                                          supports multiple inheritance */ {
    override def area: Double = 0.5 * base * height //area method from abstract class Polygon

    def color: String = "blue" //color method from trait Shape
  }

}

