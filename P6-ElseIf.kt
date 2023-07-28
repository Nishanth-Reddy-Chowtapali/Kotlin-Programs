fun main() {
    var age = 2

    if (age <= 4) {
        println("Toddler")
    } else if (age in 5..12) {
        println("Kid")
    } else if (age in 12..18) {
        println("Teenage")
    } else if (age > 18) {
        println("Adult")
    }
}