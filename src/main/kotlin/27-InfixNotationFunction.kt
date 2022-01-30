fun main() {
    val name = "Andika"
    val kapital = name ubahKe "UP"
    println(kapital)
}
//  Infix notation function is a function that works like math operator, to operate 2 operands
//  almost every math operation are infix notation
//  to make invoke infix notation, we don't need to use "." like extension function
//  we have requirement to make infix notation function :
//  1. must be function member / extension function
//  2. function must not use varargs and default value
//  3. just have 1 parameter

infix fun String.ubahKe(type: String): String{
    if (type == "UP"){
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}