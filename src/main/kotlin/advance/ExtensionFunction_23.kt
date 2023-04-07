package advance

/*
Extension Functions allow us to add functionality to an existing class without having
access to its source code. Under the hood, extensions do not actually modify the
classes they extend.
We merely make a new function callable with the dot-notation on variables
of this type. Once we declare an extension function, it's available as if it were
declared on the class.
*/

fun String.isContainVowel():Boolean{
    val result = this.find {
        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
    }
        /*
        Returns the first character matching the given predicate, or null if no such character was found.
         */
        // Alternative way, to bypass case sensitivity
//        val result = this.find {
//            it.toLowerCase() == 'a' || it.toLowerCase() == 'e' || it.toLowerCase() == 'i' || it.toLowerCase() == 'o' || it.toLowerCase() == 'u'
//        }
    return result != null
}

fun main(){
    println("Namaste Kotlin".isContainVowel())
}