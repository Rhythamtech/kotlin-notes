package functions

//Repeat statement is like while loop, which executes a block of code  N-number of times (without any condition).
fun repeatExample(){
    println("\nInside Repeat ")
    var count = 0
    repeat(5) {
        println("Count is $count")
        count++
    }
}

/*
    -A while loop is a control flow statement that allows a particular code block to be executed repeatedly
     based on a given condition which returns a boolean value.

    -The corresponding block of code is executed continuously until the condition fails.

    -The while loop can be imagined of as a repeating if statement.
*/

fun whileExample(){
    println("\nInside While")
    var count = 0
    while (count < 5) {
        println("Count is $count")
        count++
    }
}

fun main(){
    repeatExample()
    whileExample()
}