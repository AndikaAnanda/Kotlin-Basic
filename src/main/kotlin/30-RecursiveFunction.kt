//  recursive function is a function that invoke itself
//  recursive function usually used to doing loop work, because the code will be simpler with recursive
//  in this case, we want to calculate factorial to see the benefit of recursive

fun main() {
//  example of loop function :
    fun factorialLoop(num: Int): Int{
        var result = 1
        for (i in num downTo 1){
            result *= i
        }
    return result
    }
    println(factorialLoop(5))

//  Recursive function :
    fun factorialRecursive(num: Int): Int{
        return when (num){
            1 -> 1
            else -> num * factorialRecursive(num - 1)
        }
    }
    println(factorialRecursive(5))
}