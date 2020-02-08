package cousera

fun main(args: Array<String>) {
    val argument = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello $argument")
}