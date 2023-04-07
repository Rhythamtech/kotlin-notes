package basics
// There are two ways to Store data value inside a variable
// Using "val" or "var" to assign a value.
// Let's discuss some main or key differences between "var" and "val"
// Variable created using "var" keyword can modify/changeable
// While "val" keyword can't modify

//code:

fun main(){
    // With "val" you can assign value only once
    val x=4
    //  x=6  ERROR
    // We can assign
    val str = "string"
    val numInt = 1
    val numDouble = 1.0
    val bool = false

    var y=7
    y=20 //POSSIBLE

    // Also, there is an important concept that once we assign a value to a variable of Any type
    // we can change its type.
    // Let's understand via code

    var mystr = "Namaste Coder"
    // mystr=12 ERROR : The integer literal does not conform to the expected type String
    println(mystr)

    // Number types won't implicitly convert to other types, so we can't assign
    // A short value to a long variable or a byte to an int
    val bte: Byte = 1
    // val i: Int = b // ERROR Type Mismatch
    // But we can always assign them by casting like this;
    val i: Int = bte.toInt()

    //Now, we have variables with value, but what happen when a variable do not have any value?
    // Sounds crazy right?
    // In Kotlin,we have a beautiful feature which helps avoid null pointer exceptions
    // When we declare a variables type explicitly, by default its value cannot be null, It's default value is same as the default
    //value of its variable type. Example
    //Code:
    //var rocks: Int = null //ERROR To fix this
    // Use the question mark operator to indicate that a variable can be null
    var rocks: Int? = null

    //For the complex datatype like List
    var myList:List<String?> = listOf(null,null)

    // Some important use cases of null :
    // We can allow for the list to be null, but if it is not null its elements cannot be null
    var mylist2: List<String>? = null

    // Or we can allow both the list or the elements to be null
    var mylist3: List<String?>? = null
    mylist3= listOf(null,null)

    //Examples:
    var nameList:List<String>? = null //Allow List to null
    var nameList2:List<String?> = listOf(null,null) // Allow list items to null, but List can't be null
    var nameList3:List<String?>?=null // Allow both List and its items to null
    var simpleList:List<String> = listOf("Rhytham Negi","Aman Kumar","Amit Jha") //Normal List
    var listWithNulls: List<String?> = listOf("Kot", null, "melo", null) // List with some null items

    var a: String = "abc" // Regular initialization means non-null by default
    //a = null // compilation error

    // To allow nulls, you can declare a variable as nullable string, written String?:
    var b: String? = "abc" // can be set null
    b = null // ok
    //val l = b.length // error: variable 'b' can be null
    print(b)

    val strTemp = "Kotlin"
    val strTemp2: String? = null
    println(strTemp2?.length)
    println(strTemp?.length) // Unnecessary safe call
    // This returns "strTemp2.length" if "strTemp2 is not null", and "null" otherwise. The type of this expression is Int?
    // "strTemp2?.length" is equal to "if (strTemp2 != null) strTemp2.length else -1

    //Quick Note:
    // If we want to do an operation on the non-null items
    // To perform a certain operation only for non-null values, we can use the safe call operator together with let:
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kot,melo and ignores null
    }

}