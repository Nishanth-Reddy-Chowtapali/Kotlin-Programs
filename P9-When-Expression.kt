fun main() {

    when (val alarm = 6) {
        12 -> println("The time is $alarm")
        24 -> println("The time is $alarm")
        7 -> println("The time is $alarm")
        2, 6, 15 -> println("The alarm is $alarm")          // Single line expression
        else -> println("The time is $alarm")
    }
}