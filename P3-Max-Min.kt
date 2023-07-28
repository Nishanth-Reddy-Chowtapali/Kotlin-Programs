fun main() {
    var number = 32

    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE

    println("Maximum Integer value is: $maxIntegerValue")
    println("Minimum Integer value is: $minIntegerValue")

    // number = 2147483648 throws an error
    number = 2147483647 // within the limit of Integer

    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE

    println("Maximum Byte value is: $maxByteValue")
    println("Minimum Byte value is: $minByteValue")

    val myMaxShortValue = Short.MAX_VALUE
    val myMinShortValue = Short.MIN_VALUE

    println("Maximum Short value is: $myMaxShortValue")
    println("Minimum Short value is: $myMinShortValue")

    val myMaxLongValue = Long.MAX_VALUE
    val myMinLongValue = Long.MIN_VALUE

    println("Maximum Long value is: $myMaxLongValue")
    println("Minimum Long value is: $myMinLongValue")
}