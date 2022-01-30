fun main() {
    sayHello("Andika", "Ananda")

    sayHello2("Andika", null)
    sayHello("Andika", "Ananda")
}
//  If we want to use data from outside, use parameter
//  And then invoke in main function with argument
fun sayHello(firstName: String, lastName: String){
    println("Hello, $firstName $lastName")
}

//  Parameter can be nullable, but we still must completely fill argument
fun sayHello2(firstName: String, lastName: String?){
    println("Hello, $firstName $lastName")
}