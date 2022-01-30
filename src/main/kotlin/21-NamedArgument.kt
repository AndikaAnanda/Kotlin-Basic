fun main() {
    fullName(lastName = "Yusrizal", firstName = "Andika", middleName = "Ananda")
}

//  Imagine that we have function with 10 or more parameter
//  When we want to fill the argument, it can make us confuse to decide the position of parameter
//  So, we can use Named Argument, so we don't need to think about parameters position
//  Just mention the parameter in the argument field
//  Note : Named parameter can't mix with other, so if we want to use named parameter, you must use it all along arguments
fun fullName(firstName: String, middleName: String, lastName: String){
    println("Fullname : $firstName $middleName $lastName")
}