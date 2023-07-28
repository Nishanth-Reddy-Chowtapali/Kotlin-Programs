fun main() {
    println(getMax(5, 8))
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max                              // return statement returns the value of max to the function getMax
}

// we can write the above code in a single line

fun getMin(a: Int, b: Int) = if (a < b) a else b