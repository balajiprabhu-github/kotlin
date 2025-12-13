package higher_order_functions

/*
Problem 7: Generic Function Composition

Your task is to create a generic higher-order function named `compose`.

This function should:
1. Be generic, working with three types: `A`, `B`, and `C`.
2. Accept two functions as arguments:
   - `f` with the signature `(B) -> C`
   - `g` with the signature `(A) -> B`
3. Return a *new* function that has the signature `(A) -> C`.

The returned function should apply `g` to its input first, and then apply `f`
to the result of `g`. In other words, `compose(f, g)` should produce a function `h`
such that `h(x)` is equivalent to `f(g(x))`.
*/

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun main() {
    val add5: (Int) -> Int = { it + 5 }
    val multiplyBy2: (Double) -> String = { "Result: ${it * 2}" }
    val intToDouble: (Int) -> Double = { it.toDouble() }

    // 1. Compose the functions. Let's create a function that adds 5 to an Int,
    //    converts it to a Double, and then multiplies by 2 to produce a String.
     val composedFunc = compose(multiplyBy2, compose(intToDouble, add5))

    // 2. Test the composed function.
     val result = composedFunc(10) // Should be "Result: 30.0"
     println(result)

    // Expected flow for composedFunc(10):
    // a. add5(10) -> 15
    // b. intToDouble(15) -> 15.0
    // c. multiplyBy2(15.0) -> "Result: 30.0"
}
