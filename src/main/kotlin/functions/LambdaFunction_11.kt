package functions

/*
    Lambda function is a function with no name.
    Syntax:
    { variable -> body_of_function}

*/

fun main(){
    var sayHi = {
        println("Hi, Guys")
    }
    var sayHello={
        println("Hello, Guys")
    }

    var sayBye={
        println("Bye, Guys")
    }

    var saltQuantity:(Int)->Int = {water->Int
        water/5
    }


    println(sayHi())
    println("${saltQuantity(10)} Kg Salt")

    val fn:(String,String)->String ={ org,portal -> "Org: is $org and Portal is $portal"}
    println(myFun(
        org="com.example.lamba",
        portal = "Namaste Kotlin",
        fn=fn
    ))

}
    /*
 The real power of lambda happens when we make higher-order functions
 A higher-order function is just any function that takes a function as the argument
 Kotlin prefers function arguments to be the last parameter
 Higher-order function that takes function as an argument
     */

fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

/*
Above Example, We define a function "myFun" taking 3 arguments
First 2 arguments are String , But argument "fn" is a function which take 2 String parameters and return a String
 */