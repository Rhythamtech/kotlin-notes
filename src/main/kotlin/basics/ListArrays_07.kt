package basics

import java.util.*

/*
In Kotlin, we have two Types of List :
    1. List
    2. MutableList

List : (Read Only) in a List we can only read its elements which we have given at the time of Declaration.
MutableList : (READ/WRITE) in MutableList we can change, remove, add... its elements

Prefer MutableList over Array
The major difference from usage side is that;
-> Arrays have a fixed size (like int [] in C++)
-> MutableList can adjust their size dynamically (like vectors in C++, a.k.a dynamic
arrays)
-> Moreover Array is MUTABLE whereas List is not. (List is read-only, Array is not)

NOTE:

In Kotlin, "val" variables are declared with the keyword "val" and are immutable, meaning that their value cannot
be changed once assigned. However, this does not mean that the object that the variable refers to is immutable.
For example, if val x = mutableListOf(1, 2, 3), then x is a reference to a mutable list object and we can add or
remove elements from the list.
However, we cannot assign x to a different reference later, such as x = mutableListOf(4, 5, 6).
This would result in a compilation error because val variables cannot be reassigned.

*/

fun important(){
    val myList = mutableListOf(1, 2, 3) // create a mutable list and assign it to a "val" reference
    myList.add(4) // this is allowed, we can modify the list contents
   // myList = listOf(5, 6, 7) // this is not allowed, we cannot reassign a different list to myList
}
fun main() {

  /*
 ===========================================
  create an array
 ===========================================
  */

    val nameArray = arrayOf("Rhytham Negi", "Aman Kumar", "Ajit Kumar")
    // This does not prints the all elements, it prints the array address instead
    println(nameArray) // [Ljava.lang.Object;@66d3c617

    // You can use joinToString or forEach, forEachIndexed, Arrays.toString( array )
    println("From joinToString() " + nameArray.joinToString())
    println("From forEach{}")
    nameArray.forEach {
        print(it)
    }
    println("\nFrom forEachIndexed{} ")
    nameArray.forEachIndexed { index, s ->
        println( "Index of $s is $index")
    }

    println("\nFrom Arrays.toString() "+Arrays.toString(nameArray))

    // Error, Type Mismatch
    //val test = intArrayOf(2, "foo")
    // But you can mix types in Untyped arrays
    val mixedArray = arrayOf("fish", 2, 's', 0.0)
    for (element in mixedArray) {
        println(element) // fish 2 s 0.0
    // print(element.toString() + " ")
    }

    // We can do nesting in arrays
    val arr = listOf(5, 12)

    val arrParent = arrayOf(arr, arrayOf("A", "B", "C"))
    println(Arrays.toString(arrParent)) //[[5, 12], [Ljava.lang.String;@3f91beef]

    // We can merge array but "ARRAYS" are passed by reference not by value to Fix this we can use
    //list as below

    val intList = listOf(5, 12)
    val stringList = mutableListOf("A", "B", "C")

    val bigList = listOf(intList, stringList)
    println(bigList.joinToString()) // [5, 12], [A, B, C]

    // OR val stringList = listOf("A", "B", "C")

    // Refer Lists.txt and Arrays.txt for more


}