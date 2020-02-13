package cousera


enum class Color {
    BLUE, ORANGE, RED
}

fun main() {

    fun getColor(color: Color): String = when (color) {
        Color.BLUE -> "Blue"
        Color.RED -> "Red"
        Color.ORANGE -> "Orange"
    }

    print(getColor(Color.ORANGE))

}