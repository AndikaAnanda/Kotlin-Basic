fun main() {
//  Break and continue are keyword to stop Loop
//  They can be used to all loops form

//  Break is used to stop all action in loops :
    var i = 0
    while (true){
        println("Iteration $i")
        i++
        if (i > 10){
            break
        }
    }
//  Continue is used to stop loop if the condition is true, then continue the loop if its condition is false
    for (i in 1..100){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
}