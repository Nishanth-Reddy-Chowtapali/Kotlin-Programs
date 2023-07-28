fun main() {
    sayHello()
    userName("Nishanth")
    userName("Nishanth_Reddy")
    details("Nishanth", 25, "Male")
}

fun sayHello() {
    println("Hello")
}

fun userName(name: String) {            // parameter "name" is immutable(by default its declared as val)
    println("Hello $name")
}

fun details(name: String, age: Int, gender: String){
    println("Hello $name of age: $age and you are a $gender")
}