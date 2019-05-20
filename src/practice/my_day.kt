package practice

fun main(args : Array<String> ){

    // pass your name in command line argument else it will cause error
    println("Hello ${args[0]}!")

//    repeat(8){
//        println("Smile")
//    }

//    println(whatShouldIDoToday((readLine()!!), readLine()!!))

    val spices = listOf("curry", "pepper", "cayenne",  "ginger", "red curry", "green curry", "red pepper" )

    println(spices.filter { it.startsWith('c') && it.endsWith('e') }.sortedBy { it.length })

    val lazyDemo = spices.asSequence().map { println(it) }

    lazyDemo.toList()

//    println("${lazyDemo.toList()} lazy demo")

    println(spices.take(4).sortedBy { it.length })







}

fun isVeryHot (temperature: Int) = temperature > 35

fun isSadRainyCold (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}