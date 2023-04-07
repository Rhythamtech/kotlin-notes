package classes

/*
Classes are blueprints for objects
Class - Object Blueprint
Objects are instances of classes
Properties are characteristics of classes such as the length
Methods are the functionality of the CLass
Interfaces are a specification that a class can implement
*/

class Classes_12 {
    var member01:String ="I'm member 01"
    var member02:String ="I'm member 02"
    fun memberFunction():String{
        return "I'm member Function"
    }
}

class SimpleSpice() {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int = 5
}

fun main(){
    var obj= Classes_12()
    println(obj.member01)
    println(obj.member02)
    println(obj.memberFunction())

    var simpleSpice = SimpleSpice()
    println("name: ${simpleSpice.name}, heat: ${simpleSpice.heat}")

}

