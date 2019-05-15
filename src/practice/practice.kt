package practice

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    feedTheFish()
}


fun feedTheFish(){
    val day = randomDay()
    val food = "worms"
    println("Today is $day and the fish eat $food" )
}

fun randomDay() : String {

    val week = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random().nextInt(7)]

}



fun dayOfWeek() {

    val dayOfWeekStatusCode = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("What day is it today")

    println(
        when (dayOfWeekStatusCode) {

            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        }
    )

}