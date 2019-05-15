package aquarium

import java.util.*

fun main(){

    println("Hello, Balaji")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {

    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]

}

fun fishFood(day : String) : String {

    return when (day){
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
