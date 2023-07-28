fun main(){
    // var can be re-assigned
    var userName = "Nishanth"       //String type
    userName = "Nishanth Reddy"     //variable is re-assigned

    // val cannot be re-assigned
    val age = 25                    //Integer type
    //age = 26   its throws an error

    var isActive = true             //Boolean type
    var balance = 25670.50          //Float type

    println("Hi $userName your age is: $age and your account status is $isActive which is active." +
            " Your current account balance is $balance")
}