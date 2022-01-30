fun main() {
    defaultParameter("Andika")
    defaultParameter("Andika", "Ananda")

    nullDefault("Andika")
}

//  Default parameter can make you possibly not fill the argument
//  if you not fill the argument, the default argument will be used
//  but if you fill the argument, the default argument will be ignored
fun defaultParameter(firstName: String, lastName: String = "Biasalah"){
    println("The name is $firstName $lastName")
}

//  Default parameter can be nullable
fun nullDefault(firstName: String, lastName: String? = null){
    println("The name is $firstName $lastName")
}
