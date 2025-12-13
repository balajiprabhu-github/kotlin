package higher_order_functions

/*
Problem 5: Filtering and Mapping a List of Objects

Your task:
Using the 'people' list, create a new list containing the
uppercase names of all adults (age 18 or older) who live in "New York".

To solve this, you will need to chain 'filter' and 'map' operations together.
*/

data class Person(val name: String, val age: Int, val city: String)

fun main() {
    val people = listOf(
        Person("Alice", 29, "New York"),
        Person("Bob", 17, "London"),
        Person("Charlie", 20, "New York"),
        Person("David", 45, "Paris"),
        Person("Eve", 16, "London"),
        Person("Frank", 30, "New York")
    )

    val adultsInNewYork = people.filter { people -> people.age >= 18 && people.city == "New York" }.map { people ->
        people.name.uppercase()
    }
    println(adultsInNewYork)
}
