package classes

import functions.Test

/*
    Only one primary constructor in a Kotlin class whereas secondary constructor may be one or more.

    Primary Constructor is used to Initialize the class. It declared at class header Like
    class classTest(fname:String,lname:String){}

    Primary Constructor with init block.
    As primary constructor with no code implementation, we use "init" keyword or "init" block to initialize the logic.
    Important point: Execution order is same as declaration order.

    Secondary Constructor with "constructor" keyword
    Example:
    class Test{
        constructor(num:Int){
            //Constructor BODY
        }
         constructor(fname:String,lname:String){
            //Constructor BODY
        }

    }
    
 */
class Test(num:Int,name:String){

    var fnameProperty = "Name is $name".also {
        println(it)
    }
    init {
        println("First init Constructor Execute")
    }

    var numProperty="Number is $num".also ( ::println )

    init {
        println("Second init Constructor Execute")
    }

}

class Test02(age:Int){
//    constructor(num: Int){
//        println("Square of $num is ${num*num}")
//    }

/*
    We can use Primary and Secondary Constructor Together
    Example:
        constructor(fname:String,lname:String,age:Int):this(age){
            //Constructor BODY
        }
    Using "this" keyword we can also call one secondary constructor to another.
    Example:
        constructor(name:String,username:String):this(name,username,"example.email@example.com"){
        //BODY
        }
        constructor(name:String,username:String,email:String){
        //BODY
        }
*/

    constructor(fname: String, lname:String, age:Int):this(age){
        println(" FirstName is $fname, lastName is $lname and Age is $age")
    }
}

fun main(){
    var test = Test(12,"Namaste Kotlin")
//    var test02= Test02(22)
    var test02= Test02("Namaste Kotlin","by Rhytham Negi",24)
}
