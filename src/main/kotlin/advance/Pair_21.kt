package advance

fun main() {
    // We can write pair like these ways
    val firstPair = "namaste" to "kotlin"
    println(firstPair.first)
    println(firstPair.second)

    val secondPair = "namaste" to "kotlin" to "for all"
    println(secondPair)

    val thirdPair = "namaste" to "kotlin" to "for everyone" to "from everywhere"
    println(thirdPair)

    val fourPair = ("namaste" to "kotlin") to ("for everyone" to "from everywhere")
    println(fourPair)
    println(fourPair.first)
    println(fourPair.second)

    var (firstWord, secondWord) = firstPair // this is call deStructuring of Pair
    /*
        Divide a Pair into two separate values "firstWord" and "secondWord"
     */

    println("First Word is $firstWord and the Second Word is $secondWord")
    // Why we use
    // var (firstWord,secondWord) = firstPair
    // The reason behind that , we can use to return two values from a function
    /*
        Example:
            fun giveMeATool(): Pair<String, String> {
                return Pair("fishnet", "catching")
                // return ("fishnet" to "catching") // Alternative
            }

         then, we destruct like above
     */
}

