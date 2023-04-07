package classes

/*
    Abstract class is a class denoted by "abstract" keyword.
    An abstract class cannot be instantiated.
    Abstract class is partially defined class

    Example:
    abstract class A {
    var x = 0
    abstract fun doSomething()
    }

    non-abstract class can overriden in abstract class
 */

open class Car {
    open fun run() {
        println("Car is running..")
    }
}
abstract class Honda : Car() {
    override abstract fun run()
}
class City: Honda(){
    override fun run() {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Honda City is running..")
    }
}
fun main(){
    val car = Car()
    car.run()
    val city = City()
    city.run()
}

/*
Imagine you have 2 classes
Class Person [parent class]
Class Coder [sub/child class]

When we want to inherit Coder from Person you have to make Person open, so it is
available to inherit from. Meanwhile, you can make objects from Person itself.
When you don't need to make objects from parent class(in our case it's Person) or you
don't see any meaning creating objects from it you can use abstract instead of open.
It works the same way as open does. But the main difference is that you cannot make
objects from Person(parent class) anymore.
Abstract class cannot be instantiated and must be inherited, abstract classes are open
for extending by default.
Open modifier on the class allows inheriting it. If the class has not open modifier it
is considered final and cannot be inherited
 */