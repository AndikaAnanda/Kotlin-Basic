//  closure is the ability of function to interact with other data in the same scope
//  closure is not recommended to used because if we not careful, it will change other data that we not wanted to change

fun main() {
    var counter = 0
    fun funCounter()  {
        println("counter!")
        counter++
    }
    funCounter()
    funCounter()
    funCounter()

}