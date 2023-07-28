fun main() {
    var name1: String = "Gojo"                                // Non nullable data type
    var name2: String? = null                                 // Nullable data type
    name2 = "nish"
    println(name2?.uppercase())


    var name3 : String? = null
    var userName:String = name3?: "Nishanth"                  // elvis operator
    /* if name3 is not null it will assign the value of name3 to username
    if name3 is null then Nishanth is assigned to username
     */
    println(userName)

}