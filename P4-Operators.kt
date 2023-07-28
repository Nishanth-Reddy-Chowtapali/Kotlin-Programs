fun main() {
    // Single line comment
    /* i am a
    multi
    line
    comment
     */

    var x = 55
    var y = 12

    println("x + y = ${ x + y }")       // Addition
    println("x - y = ${ x - y }")       // Subtraction
    println("x / y = ${ x / y }")       // Division
    println("x * y = ${ x * y }")       // Multiplication
    println("x % y = ${ x % y }")       // Modulus

    var a = 15.6
    var b = 10

    println("a + b = ${ a + b }")
    println("a - b = ${ a - b }")
    println("a / b = ${ a / b }")
    println("a * b = ${ a * b }")
    println("a % b = ${ a % b }")

    var result = x + y

    result += 10         // it is equivalent to result = result + 10
    println("result = $result")

    x = 0
    println("x = ${ x++ }")     // it increments the value of x by 1 after the line is executed
        // the value of x is 1 after the line is executed
    println("x = ${ ++x }")     // it increments the value of x by 1 before the line is executed
        // the value of x is 2

    println("x = ${ x-- }")     // it decrements the value of x by 1 after the line is executed
    // the value of x is 1 after the line is executed
    println("x = ${ --x }")     // it decrements the value of x by 1 before the line is executed
    // the value of x is 0
}