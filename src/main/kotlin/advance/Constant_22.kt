package advance

/*
We have "val" and "const val" now, What is the difference?
Top Level, Compile Time Constant Variable
The value is always determined at compile time
const value set it compile time so we cannot call and execute a function
to get its value set

In other words :
“val” and “const val” are both for read-only variables. The difference is:

“const val” is for top-level variables that never change. Their values are fixed when the program is compiled.
“val” is for variables that can be assigned at runtime. Their values can depend on some code or function that runs when the program starts.
 */

// Declare a top-level constant variable that holds the value of pi
const val PI = 3.14

// Declare a function that returns the area of a circle given its radius
fun areaOfCircle(radius: Double): Double {
    return PI * radius * radius
}

fun main(){

// Declare a read-only variable that holds the result of calling the function with 5.0 as the argument
    val area = areaOfCircle(5.0)

// Print the value of the variable
    println(area) // 78.5

// Try to change the value of the variable
// area = 100.0 // Error: Val cannot be reassigned

// ERROR!
    /*
    Modifier 'const' is not applicable to 'local variable'
    This should be Top Level!
    const val num = 5
     */
}

class MyClass {
    /*
    * The differences between
    * "Regular Objects" and "Companion Objects" are as follows;
    *
    * -> Companion objects are initialized from the static constructor
    * of the containing class, that is, they are created when the object is created
    *
    * -> Plain objects are initialized lazily on the first access to that object
    * that is, when they are first used
    * */
    companion object {
        const val CONSTANT3 = "constant inside companion"
    }
// So you need to wrap constants in classes inside a companion object
}