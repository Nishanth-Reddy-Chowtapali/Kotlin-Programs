fun main() {
    range()
    until()
    downTo()
}

fun range() {
    for (i in 1..10) {
        println("a = $i")
    }
}

fun until() {
    for (i in 1 until 10) {
        println("b = $i")
    }
}

fun downTo() {
    for (i in 10 downTo 1) {
        println("c = $i")
    }
}