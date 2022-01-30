fun main() {
//  For loop used to iterate the iterator(array, range, etc.)

//  For loop array :
    val array1: Array<String> = arrayOf("Andika", "Ananda", "Yusrizal")
    for (name in array1){
        println(name)
    }

//  For Loop Range :
    for (number in 0 .. 100 step 5){
        println(number)
    }

//  Combination of Array and Range :
    val array2: Array<String> = arrayOf("Well", "Played", "Bro")
    for (i in 0 .. (array2.size - 1)){
        println("Iteration $i = ${array2.get(i)}")
    }
}