//  to make code easier and simpler, we can put return before if & when syntax
//  so, we don't need to put so many return while the if & when are more complex

fun main() {
//  If else :
    fun sayHello(name: String): String{
        return if (name == ""){
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }
    println(sayHello("Andika"))
//  When :
    fun passTest(score: Int): String{
        return when{
            score > 75 -> "You pass the test"
            else -> "Nice try"
        }
    }
    println(passTest(80))
}