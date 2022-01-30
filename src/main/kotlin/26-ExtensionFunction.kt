//  we can make an additional function that integrated with data type such as String, Int, else, with extension function
//  extension function is powerful, but just use it while you have no option again because it makes our program confusing

fun main() {
    val name = "Andika"
    name.printHello()

    "Ananda".printHello()
}
fun String.printHello() = println("Hello, $this")
