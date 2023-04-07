package functions

/*
 Filter is a standard library function on list in kotlin.
 There are two different approach:
  1. EAGER
  2. LAZY

  Difference between EAGER and LAZY:
 -> AN EAGER algorithm executes immediately and returns a result.
 -> A LAZY algorithm defers computation until it is necessary to execute and then produces a result.
*/

fun main(){
    val list = listOf("abc", "ghf", "aaa", "tur")
    println(list.filter { it[0] == 'a' }) // Outputs: [abc, aaa]

    eagerExample()
    lazyExample()
}

//EAGER EXAMPLE
fun eagerExample(){
    val list = listOf("bablu", "paplu", "plastic", "tapu")
// Decoration EAGER here
// We'll hold a new list
// containing strings that starts with 'p'
    val decorations = list.filter {
        it[0] == 'p'
    }
    println(decorations)
}


/*
 If we want to use LAZY approach, we can use SEQUENCES (A sequence is a collection that
 only look at one item at a time starting at the beginning and going to the end) and the sequences is potentially infinite.

 But , when we use SEQUENCE with filter it won't return a new list, it will hold a sequence of all the list elements and
 knowledge of the filter to apply to its element.
 So, we have to CONVERT it toList()

 Let's understand using Example
*/
fun lazyExample(){
    val list = listOf("rock", "pagoda", "plastic", "tur")
    // Apply filter LAZILY
    val decorations = list.asSequence().filter {
        it[0] == 'p'
    }
    println(decorations) // kotlin.sequences.FilteringSequence@439f5b3d
    println(decorations.toList()) // Ignite the filter!: [pagoda, plastic]

    val lazyMap = decorations.asSequence().map {
        println("MAP $it")
        it
    }

    println(lazyMap) //kotlin.sequences.TransformingSequence@377dca04
    println(lazyMap.first()) //MAP pagoda
    println( "All ELEMENTS :${lazyMap.toList()}")
}
