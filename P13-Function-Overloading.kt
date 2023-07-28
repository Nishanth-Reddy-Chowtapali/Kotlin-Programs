fun main() {
    val max = getMaxNumber(5.6, 6.8)
    println(max)
    println(getMaxNumber(5,6,7))
}

fun getMaxNumber(a: Int, b: Int) = if (a > b) a else b

fun getMaxNumber(a: Double, b: Double) = if (a > b) a else b        // function overloading

fun getMaxNumber(a: Int, b: Int, c: Int): Int {                     // function overloading
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}