package basics// Elvis operator " ?: "
/*If the expression to the left of ?: is not null, the elvis operator returns it,
otherwise it returns the expression to the right. Note that the right-hand side
expression is evaluated only if the left-hand side is null.*/

fun main(){
    val b:String? = "Namaste Kotlin Notes"
   // val b:String? = null

    val len: Int = if (b != null) b.length else -1
    //Same as above
    val l = b?.length ?: -1 // For better understanding ((b?).length) ?: -1
    println (l)

    var b2: String? = null
    var l2 = b2?.length ?: -1
    print(l2)
}