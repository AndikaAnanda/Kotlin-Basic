//  const variable is similar with val, its immutable, but we can access this variable globally in program
const val APP = "Variable app"

fun main() {
//  variable is divided to 2 type, mutable & immutable. Immutable is recomended
//  mutable(variable with changable value) :
    var angka: Int = 10
    println()
    angka = 90
    println(angka)
//  immutable(cannot be changed) :
    val huruf: Char = 'a'
    
//  we can delete the data type, because kotlin automatically detect data type from data itself
    val age = 10
    val name = "Andika Ananda"
    val money = 1000000L
    
//  the variable in kotlin must be assigned, if its empty, the variable is not null as we expected.
//  but we can force a variable to be nullable(not recomended)
    var kata1: String? = "Andika"
    kata1 = null
    println(kata1?.length)
    
}