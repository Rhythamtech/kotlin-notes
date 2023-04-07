package classes

/*

Inheritance is feature where we can use properties of one Class to another Class via inherit them.
The main class is called super class (or parent class) and the class which inherits the superclass is called subclass (or child class).
The subclass contains features of superclass as well as its own.
-Code Re-usability

Example:
    open class Base(p: Int){

    }
    class Derived(p: Int) : Base(p){

    }

Use of "open" Keyword:
By default Classes in Kotlin is "final" means we cannot inherit the class.
To make it non-final or inheritable we use "open" keyword.

Override a method:
Implementation of Base class (Parent class) method to it derived class (Child class).
Means, child class redefine or modifies the method of parent class

Rules of method overriding

--Parent class and its method or property which is to be overridden must be open (non-final).
--Method name of base class and derived class must have same.
--Method must have same parameter as in base class.
*/

open class Base{
    var x:Int = 5

    fun foo(){}
    open fun overrideMe(){
        // BODY
    }

}

class Derived:Base(){
    fun namaste(){
        println("Namaste Value of X is $x")
    }

    override fun overrideMe(){
        //Body
    }
}

fun main(args: Array<String>) {
    val derived = Derived()
    derived.namaste()
}