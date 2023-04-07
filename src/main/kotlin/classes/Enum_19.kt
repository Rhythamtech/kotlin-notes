package classes

/*
    1. Enum is a class of constant.
    2. Each enum constant is an object.
    3. Enum constant are separated by Commas.
 */

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// In Enum, we can also declare Anonymous Class.

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
