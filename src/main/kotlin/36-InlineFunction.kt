//  although higher order function is powerful, it has weakness too
//  when in the function has too many loops, the program will run slowly because it will invoke object in bytecode
//  but we can use inline to make the program faster, because in bytecode, object is not invoked
//  don't use inline it's not necessary

//  when we decide the function to be inline, the parameter will be inline too
//  if we want to parameter not inline, use keyword noinline

inline fun sayGreetings(noinline firstName: () -> String, lastName: () -> String): String{
    return "Hello ${firstName()} ${lastName()}"
}
fun main() {
    println(sayGreetings({"Andika"}, {"Ananda"}))
}