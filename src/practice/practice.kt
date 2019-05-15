package practice

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    dayOfWeek()
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