package classes

/*
    A class declared as sealed class using "sealed" keyword before the class name.
     It is used to represent restricted class hierarchy.

     Example:
     sealed class sealedClass{}
 */

sealed class Shape{
    class Circle(var radius:Float): Shape()
    class Square(var side:Int):Shape()
    class Rectangle(var length:Int,var breath:Int):Shape()
}
/*
     Sealed classes are commonly used with when expression.
     As the sub classes of sealed classes have their own types act as a case.
     Due to this, when expression in sealed class covers all the cases and avoid to add else clause.
 */
fun cal(shape: Shape){
    when(shape){
        is Shape.Circle -> {
            println(" Area of Circle is ${3.14*shape.radius*shape.radius}")
        }
        is Shape.Rectangle ->{
            println(" Area of Rectangle  is ${shape.length*shape.breath}")
        }

        is Shape.Square -> {
            println(" Area of Square is ${shape.side*shape.side}")
        }
        else -> {
            println("Invalid Object Passed")
        }
    }
}

fun main(){
    val circle = Shape.Circle(12.5f)
    val square = Shape.Square(25)
    val rectangle = Shape.Rectangle(12,55)

    cal(circle)
    cal(square)
    cal(rectangle)
}