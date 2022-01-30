fun main() {
    greetings("Andika")

    val result = multiplyWith2(100)
    println(result)
}
//  if we have a function with just 1 line of block code, whether is Unit return or Returning data,
//  just use single expression function to make code simpler
//  in single expression function, we change curly bracket with "="

//  Unit returning function
//  instead we code like this :
//  fun greetings(name: String){
//      println("konbanwa, $name")
//  }
//  we can just code like this :
fun greetings(name: String) = println("Konbanwa, $name")

//  returning data type function
//  instead we code like this :
//  fun multiplyWith2(a: Int): Int{
//      return a * 2
//  }
//  we can just code like this(automatically detect return) :
fun multiplyWith2(a: Int): Int = a * 2
