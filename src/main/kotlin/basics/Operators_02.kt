package basics//In the kotlin we have  -, +, /, *,% as operators
//        + => Addition Operator
//        - => Subtraction Operator
//        * => Multiplication Operator
//        / => Division
//        % => Modulus (Return remainder)
//        ++ => Incremental Operator ( add +1 in value)
//        -- => Decremental ( subtract -1 in value)

fun main(){
        println(1 + 1) // Prints: 2
        println(53 - 3) // Prints: 50
        println(50 / 10) // Prints: 5
        println(1 / 2) // Prints: 0
        println(6 * 50) // Prints: 300

// In Kotlin, we also have the Extension Functions (For now , Consider this as a function who extend
// th feature of any Existing function without modifying the actual logic of the Function )
// Using that Extension function we can perform some basic operators .

        val num = 2
        println(num.times(6)) //(6*2) Prints: 12
        println(num.div(10.0)) //(2/10.0) Prints: 0.2
        println(num.plus(3)) //(3+2) Prints: 5
        println(num.minus(3)) //(2-3) Prints: -1


// You can use numbers(basic types) as if they were objects
// Use primitive 'int' as an object
                1.toLong() // 1
        println(false.not()) // true




}