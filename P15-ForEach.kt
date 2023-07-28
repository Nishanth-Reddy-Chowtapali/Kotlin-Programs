fun main() {
    add(1, 2, 3, 4, 5, 6, 7, 8, 9)
}

fun add(vararg numbers: Int) {
    var temp = 0
    numbers.forEach { number -> temp += number }
    println(temp)
}