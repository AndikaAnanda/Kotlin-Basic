fun main() {
    val result = triangleArea(200, 300)
    println(result)
}
//  beside unit returning function, we have return type function
//  we must include return data type in function name, like int, long, and else
//  then, in function's block, we must return the data that same as function return data type
//  we can't just invoke it like unit returning type
//  usually, when we invoke returning function, we assign it to variable

fun triangleArea(a: Int, b: Int): Double{
    val result = a * b * 0.5
    return result
}