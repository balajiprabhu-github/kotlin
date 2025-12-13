package higher_order_functions

fun main() {
    val numbers = (1..5).toList()
    val squareNumbers = numbers.map {
        num -> num * num
    }
    println(squareNumbers)
}