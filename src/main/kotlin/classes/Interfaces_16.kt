package classes

/*
1. Abstract Classes
2. Interface

interface example:
    interface testInterface{
        //we can declare properties inside Interface
        var prop:String //abstract

        fun namaste()
    }

    class testClass: testInteface{
        override var prop:String = "Namaste Kotlin"
        override fun namaste(){
            // FUNCTION BODY
        }
    }

    //Multiple Inheritance achieve via "interface"

    interface testInterface2{
        fun namasteFunc()
    }

    class testClass2:testInterface,testInterface2{
        override fun namaste(){
        }

        override fun namasteFun(){
        }

    }
 */

interface employee{
     var employeeName:String
     fun doSomething()
}

class juniorDeveloper : employee {
    override var employeeName: String = "Rhytham Negi"
    override fun doSomething() {
        println(" Do Task assigned by Senior dev")
    }
}

class seniorDeveloper : employee {
    override var employeeName: String = "Rhytham Negi as Senior dev"
    override fun doSomething() {
        println(" Do Task assigned by Tech Lead")
    }
}

fun main(){
    var jrDev = juniorDeveloper()
    var snrDev = seniorDeveloper()
    println("Dev name is ${jrDev.employeeName} and Task:  ")
    jrDev.doSomething()
    println("Dev name is ${snrDev.employeeName} and Task: ")
    snrDev.doSomething()
}