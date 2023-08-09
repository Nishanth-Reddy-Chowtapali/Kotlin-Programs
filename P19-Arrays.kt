fun main() {
    val names = arrayOf("Goku", "ichigo", "luffy", "naruto")
    var i = 0
    while (i < 4) {
        println(names[i])
        i++
    }

    println("The size of the array is: ${names.size}")
    names[0] = "Nishanth"
    println(names[0])


// Another way to print the elements of array
    for (name in names) {
        println(name)
    }


/* We can create an array with multiple types
and print it out by filtering singe type*/

    var mix = arrayOf(1, 10.2, 245, "six", '5', 54)

    for (i in mix) {
        if (i is Int) {
            println(i)
        }
    }


}
