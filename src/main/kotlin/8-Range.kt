fun main() {
//  Range variable is variable with set of sequential number
//  It can be increased / decreased sequential

//  For increased value :
//  val range: IntRange = 1..100

//  For decreased value :
//  val range = 100 downTo 1

//  For range with jumped value, we can add step
    val range = 100 downTo 1 step 2
//  Range operations :
    println(range.count())
    println(range.first)
    println(range.last)
    println(range.contains(10))
    println(range.step)

}