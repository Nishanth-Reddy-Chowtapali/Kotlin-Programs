fun main() {
    println(sum(2, 5, 8, 6, 9, 8, 7, 4, 15, 8, 5, 5))
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}