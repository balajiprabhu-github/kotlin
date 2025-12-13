package higher_order_functions

/*
Problem 6: Generic Memoization Function

Your task is to create a generic higher-order function named `memoize`.

This function should:
1. Be generic, working with any input type `K` and output type `V`.
2. Accept a single argument: a function `block` with the signature `(K) -> V`.
3. Return a *new* function that has the exact same signature: `(K) -> V`.

The returned function must behave as follows:
- The first time it's called with a specific input `k`, it must call the original `block(k)`,
  store the result in a cache, and return it.
- On any subsequent call with the same input `k`, it must return the cached result
  *without* calling the original `block` again.
*/

fun <K, V> memoize(block: (K) -> V): (K) -> V {
    val cache = mutableMapOf<K, V>()
    return { k ->
        cache.getOrPut(k) { block(k) }
    }
}


fun main() {
    // This is a "slow" function to test our memoization.
    val slowToUpper: (String) -> String = { input ->
        println("Computing for '$input'வுகளை...")
        Thread.sleep(1000) // Simulate a long computation
        input.uppercase()
    }

    // 1. Create a memoized version of the `slowToUpper` function using your `memoize` HOF.
    val memoizedToUpper = memoize(slowToUpper)

    // 2. Test your implementation.
    println("First call:")
    val result1 = memoizedToUpper("hello")
    println(result1)

    println("\nSecond call (should be fast):")
    val result2 = memoizedToUpper("hello")
    println(result2)

    println("\nThird call with different input:")
    val result3 = memoizedToUpper("world")
    println(result3)

    println("\nFourth call (should be fast):")
    val result4 = memoizedToUpper("world")
    println(result4)
}
