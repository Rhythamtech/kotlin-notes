package basics

//Using when to print different messages based on an enum value2:
enum class Color { RED, GREEN, BLUE }

fun getColor(): Color {
    return Color.values().random()
}

fun main() {
    //Using if/else to print different messages based on a probability value1:
    val probability = 50
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability > 40 && probability < 60) {
        println("Maybe")
    } else {
        println("Likely")
    }

    val color: Color = getColor()
    when (color) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
    }

    //Using when as an expression to return a value based on a range check2:
    val x = 200
    val result = when (x) {
        in -10..0 -> "Negative"
        in 1..10 -> "Positive"
        else -> "Zero or out of range"
    }
    println(result)

    val num = 50
// .. -> inclusively 1 <= num <= 50
    if (num in 1..50) {
        println(num.toString() + " is in the range 1 <= num <= 50!")
    }
// until -> exclusively 1 <= num < 50
    if (num in 1 until 50) {
        println(num)
    } else {
        println(num.toString() + " is not in the range 1 <= num < 50!")
    }

}



