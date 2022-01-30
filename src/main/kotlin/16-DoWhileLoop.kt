fun main() {
//  Do While is similar with while loop, but do while execute block code first, then check the condition after that
//  So, if condition is false from beginning, block code still executed at least 1 time
    var i = 100
    do {
        println("iteration - $i")
        i++
    } while (i < 10)
}