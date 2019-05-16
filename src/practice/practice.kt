package practice

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")


    //    println("Your fortune is:"+ getFortuneCookie())
    // Run until your fortune is Take it easy

    for ( i in 1..10){
        val message = getFortuneCookie(getBirthDay())
        println("$i $message")
        if(message.contains("Take it easy"))
            break
    }
}


fun getFortuneCookie(birthday : Int): String {

    val message = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )


    val fortuneIndex = when(birthday){
        in 1..7 -> 2
        28,31 -> 4
        else -> birthday.rem(message.size)
    }

    return if (fortuneIndex > message.size)message[0] else message[fortuneIndex]

}


fun getBirthDay() : Int {

    println("Enter your Birthday")
    return readLine()?.toIntOrNull() ?: 1

}

fun feedTheFish() {
    val day = randomDay()
    val food = "worms"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {

    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
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