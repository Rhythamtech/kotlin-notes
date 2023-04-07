package functions

import java.text.SimpleDateFormat
import java.util.*

fun getFortuneCookie(): Pair<String, Int> {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    var birthday: String = readLine() ?: "1"
    val selectedFortuneIndex = birthday.toInt().rem(fortunes.size)
    /*
    Rem: Calculates the remainder of truncating division of this value by the other value.
    The result is either zero or has the same sign as the dividend and has the absolute value less than the absolute
    value of the divisor.
    */
    return Pair(fortunes[ selectedFortuneIndex ], selectedFortuneIndex)
}


fun main() {


    println("Namaste Kotlin")
    println(Test()) //kotlin.Unit
    dayOfWeek()

    val temperature = 10
    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message) // You are safe fish

//    if (args[0].toInt() < 12) println("Good morning, Kotlin")
//    else println("Good night, Kotlin")
//    OR
//    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
// Repeat an action x times
    repeat(10) { i ->
        println("This line will be printed 10 times")
        println("We are on the ${i + 1}. loop iteration")
    }
// Greets three times
    repeat(3) {
        println("Hello")
    }
// Greets with an index
    repeat(3) { index ->
        println("Hello with index $index")
    }

    println(randomDay())



} // Return type is Unit

fun Test() {
}// // Return type is Unit

fun dayOfWeek() {
    val date = Date()
    val day = SimpleDateFormat("u").format(date.time)
    println(
        when (day.toInt()) {
            1 -> "Monday hai Lazy wala"
            2 -> "Tuesday hai Bajrangbali wala"
            3 -> "Wednesday hai usual day"
            4 -> "Thrusday Friday se phele wala Day"
            5 -> "Friday hai Week End se phele wala (Plan banne wala day)"
            6 -> "Saturday Weekend Hai YAAR BURRRRA enjoy"
            7 -> "Sunday hai Phele Enjoy then Evening ki Tension ki Kal toh office hai ;("
            else -> {
                "Ye Meri Expertise se bahar hai I'm OUT "
            }
        }
    )
}

// Default Parameter Example
fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}


fun randomDay(): String {
    var days = listOf("MON","TUE","WED","THUR","FRI","SAT","SUN")
    return days.random()
}
