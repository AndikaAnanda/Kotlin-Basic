//  Varargs / variable arguments is a parameter that can have more than 1 arguments
//  Varargs parameter must write in last of parameter field
//  we can assume vararg as array data type
//  so why we don't just use array data type ? The code below will show the answer

//  With array :
//fun main() {
//    val numbers: Array<Int> = arrayOf(10, 23, 45, 3553, 60)
//    val result = totalNumber(numbers)
//    println(result)
//}
//fun totalNumber(numbers: Array<Int>): Int{
//    var total = 0
//    for (num in numbers){
//        total += num
//    }
//    return total
//}

//  With varargs(we don't need to create array)
fun main() {
    val result = totalNumber(10, 23, 45, 3553, 60)
    println(result)
}
fun totalNumber(vararg numbers: Int): Int{
    var total = 0
    for (num in numbers){
        total += num
    }
    return total
}