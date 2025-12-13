package higher_order_functions

fun main() {
    val numbers = (1..10).toList()
    val evenNumbers = numbers.filter { n ->
        n % 2 == 0
    }
    println(evenNumbers)
}