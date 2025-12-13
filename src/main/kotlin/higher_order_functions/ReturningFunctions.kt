package higher_order_functions

fun main() {
    val addFive = createOperationFactory("add")
    println("Result of adding 5 to 30: ${addFive(30)}")

    val multiplyByTwo = createOperationFactory("multiply")
    println("Result of multiplying 9 by 2: ${multiplyByTwo(9)}")
}

/**
 * A higher-order function that returns a new function (a lambda)
 * based on the input string.
 */
fun createOperationFactory(operation: String): (Int) -> Int {
    return when (operation) {
        "add" -> { x: Int -> x + 5 }
        "multiply" -> { x: Int -> x * 2 }
        else -> { x: Int -> x } // Default case returns an identity function
    }
}
