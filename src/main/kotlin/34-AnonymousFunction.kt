//  when we use lambda expression, we can't use more than 1 return like if else return
//  we can use anonymous function to work like lambda, but can handle complex return
//  anonymous function syntax is same as regular function, but it doesn't have function name

fun greeting2(name: String, transform: (String) -> String): String{
    val transformRes = transform(name)
    return "Oyasuminasai, $transformRes"
}
fun main() {
    val kapital = fun(word: String): String{
        if (word == ""){
            return "ups"
        } else {
            return word.toUpperCase()
        }
    }
    println(greeting("Andika", kapital))

    println(greeting("Andika", fun(word: String): String{
        return if (word == ""){
            "ups"
        } else {
            word.toLowerCase()
        }
    }))
}