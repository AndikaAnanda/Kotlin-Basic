//  although recursive is easy to use than loop, it still has disadvantage
//  when we use recursive to processing deep value(depends on your hardware) like 1 million, it will cause error stackoverflow
//  to preventing stackoverflow, kotlin can convert recursive code to common loop with "tail recursive"
//  to use tail recursive :
//  1. write tailrec before fun
//  3. don't operate recursive call with other data, just use recursive call itself

fun main() {
//  example of tail recursive :
    tailrec fun tailDisplay(a: Int){
        println("recursive $a")
        if (a > 0){
            tailDisplay(a - 1)
        }
    }
    println(tailDisplay(5))

//  in previous, we use this code, but it can cause stackoverflow :
    fun factorialRecursive(num: Int): Int{
        return when (num){
            1 -> 1
            else -> num * factorialRecursive(num - 1)
        }
    }

//  tail recursive function :
    tailrec fun factorialTail(num: Int, total: Int = 1): Int{
        return when (num){
            1 -> total
            else -> factorialTail(num - 1, total * num)
        }
    }
    println(factorialTail(10))
}