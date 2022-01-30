//  Lambda expression is a function that not declared as usual
//  The function will automatically return data, even when we not declare return
//  Syntax : val lambdaName: (data type of parameter) -> return type = { fullParameter -> function content }
fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        "Hello, $firstName $lastName"
    }
    val res = contohLambda("Andika", "Ananda")
    println(res)

//  We can use "it" keyword to lambda expression with 1 parameter
//  for just 1 parameter, we don't need to write parameter, and we assume the parameter as "it"
    val contohLambda2: (String) -> String = {
        "Okaeri, $it"
    }
    println(contohLambda2("Andika"))
}