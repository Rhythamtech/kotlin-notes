package basics//Kotlin is a modern programming language that has gained popularity in recent years.
//It is designed to be concise, expressive, and interoperable with Java (it can use any Java library and run on any Java platform).
//Kotlin can be used for various purposes, such as developing Android applications, building server-side systems, and creating multi-platform software.
//Kotlin is also easy to learn for Java developers, as it has many similarities with Java syntax and features.

fun main(){
    firstFunction()
    println(printNamasteKotlin())
    println(printNamasteKotlin2ndWay())
}


fun firstFunction(){
    println("Namaste Kotlin")
}
//When firstFunction() function call that prints "Namaste Kotlin" as output

fun printNamasteKotlin():String ="Namaste Kotlin Ist Way"
//When printNamasteKotlin() function call that return "Namaste Kotlin" as String

//There is an Alternative way to write above code :
fun printNamasteKotlin2ndWay():String{
    return "Namaste Kotlin 2nd Way"
}
