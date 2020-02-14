package cousera


fun main() {

    val list = listOf("a", "b", "c", "d", "e", "f")

    println("list")
    for ((index, value) in list.withIndex()) {
        println("$index = $value")
    }

    val map = mapOf(
        0 to "Zero",
        1 to "One", 2 to "Two", 3 to "Three"
    )

    println("Map")
    for ((index, value) in map) {
        println("$index = $value")
    }

    println("Ranges")
    for (i in 1..9) {
        print(i)
    }
    println()
    for (i in 1 until 9) {
        print(i)
    }
    println()
    for (i in 20 downTo 1 step 2) {
        print(i)
    }

}