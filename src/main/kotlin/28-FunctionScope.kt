//  our functions that we have made in previous can be accessed globally
//  to make a function that can't be accessed globally, we need to put the function in function
//  for example, if we create a function in main function, it can be accessed just in main function
//  we can use it in other function too

fun main() {
    fun contohKata(){
        println("I love you")
    }
    contohKata()
//  error
//  kataKata()
}
fun contoh(){
//  error
//  contohKata()
    fun kataKata(){
        println("hey buddy")
    }
}
