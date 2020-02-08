package cousera

fun main() {
    fun defaultArguments(char: Char = '*', size: Int = 5) {
        repeat(size) {
            print(char)
        }
        println()
    }

    defaultArguments('#', 5)
    defaultArguments('#')
    defaultArguments(size = 10)
    defaultArguments()
}