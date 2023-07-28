fun main() {
    val x = 5
    val y = 10

    // the following code compares the variables and returns a boolean value

    println(x < 5 &&  x < 10)       // Returns true if both statements are true
    println(y <15 || y > 20)        // Returns true if one of the statements is true
    
    var result = x > y              // Value of result is false
    println(!result)                // "!" Reverse the result, returns true if the result is false vise versa
}