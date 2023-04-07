package classes

/*
In Kotlin, we have 4 types of Visibility Modifier
1. public
2. private
3. protected
4. internal


Visibility Modifier for PACKAGE
 +-----------+--------------------------------------------------------------------------+
| Modifier  | Visibility                                                               |
+-----------+--------------------------------------------------------------------------+
| public    | declarations are visible everywhere                                      |
+-----------+--------------------------------------------------------------------------+
| private   | visible inside the file containing the declaration                       |
+-----------+--------------------------------------------------------------------------+
| internal  | visible inside the same module (a set of Kotlin files compiled together) |
+-----------+--------------------------------------------------------------------------+
| protected | not available for packages (used for subclasses)                         |
+-----------+--------------------------------------------------------------------------+
Note (imp) :
 If visibility modifier is not specified, it is public by default.

 Visibility Modifier for CLasses and Interface
+-----------+--------------------------------------------------------------------------+
| Modifier  | Visibility                                                               |
+-----------+--------------------------------------------------------------------------+
| public    | declarations are visible everywhere                                      |
+-----------+--------------------------------------------------------------------------+
| private   | visible inside the file containing the declaration                       |
+-----------+--------------------------------------------------------------------------+
| internal  | visible inside the same module (a set of Kotlin files compiled together) |
+-----------+--------------------------------------------------------------------------+
| protected | not available for packages (used for subclasses)                         |
+-----------+--------------------------------------------------------------------------+
Note: If you override a "protected" member in the derived class without specifying its visibility, its visibility will also be "protected".
 */

public fun function1(){} //Visible everywhere

private fun function2(){} // Visible only inside this File "VisibilityModifier_13.kt"

internal fun function3(){} // Visible only inside this "package classes"
