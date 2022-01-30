//  higher order function is a function with function parameter(lambda expression)
//  lambda expression must be placed in last of parameter
fun greeting(name: String, transform: (String) -> String): String{
    val transformRes = transform(name)
    return "Oyasuminasai, $transformRes"
}

fun main() {
//  invoke method 1:
    val kapital = {word: String ->
        word.toUpperCase()
    }
    println(greeting("Andika", kapital))

//  invoke method 2:
    println(greeting("Andika", {word: String -> word.toUpperCase()}))

//  trailing lambda(to make code more simple and readable)
//  we can separate the parameter
//  this is recommended method to invoke higher order function
    val lower = greeting("Andika") {word: String ->
        word.toLowerCase()
    }
    println(lower)
}