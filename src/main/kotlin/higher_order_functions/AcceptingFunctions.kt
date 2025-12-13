package higher_order_functions

fun main() {
    val addResult = applyOperation(5, 5) { x, y ->
        x + y
    }

    val subResult = applyOperation(10, 2) { x, y ->
        x - y
    }

    val multiplyResult = applyOperation(10, 2) { x, y ->
        x * y
    }

    val divideResult = applyOperation(10, 2) { x, y ->
        x / y
    }
    println("Add $addResult")
    println("Sub $subResult")
    println("Mul $multiplyResult")
    println("Divide $divideResult")
}

/**
 * A higher-order function that takes two integers and a function (lambda) as parameters.
 * It applies the given operation to the integers and returns the result.
 */
fun applyOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
