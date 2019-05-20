package aquarium

import java.util.*

fun main() {

    println("Hello, Balaji")
    feedTheFish()

}

fun feedTheFish() {

    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (changeTheWater(day, 21, 30)) println("Change water !!")

}


fun fishFood(day: String): String {

    return when (day) {
        "Sunday" -> "flakes"
        "Monday" -> "red worms"
        "Tuesday" -> "granules"
        "Wednesday" -> "insects"
        "Thursday" -> "small fish"
        "Friday" -> "flat rice"
        "Saturday" -> "green plants"
        else -> "Fasting"
    }
}

fun changeTheWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {

    val isTooHot = temperature > 30
    val isTooDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isTooDirty -> true
        isSunday -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isTooDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun randomDay(): String {

    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]

}
