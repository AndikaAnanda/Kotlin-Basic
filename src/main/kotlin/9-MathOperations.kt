fun main() {
//  Kotlin support all math operator, like +, -, *, /, %
    val a = 1
    val b = 2
    val c = a + b

//  if the numbers value are int, the we divide them. The result will force to int, despite the true result is decimal
    var aa = 8
    var bb = 3
    var cc = a / b
    println(cc)
//  except we add .0 to confirm the value as decimal
    val aaa = 9.0
    val bbb = 2.0
    val ccc = aaa / bbb
    println(ccc)

//  Augmented operator(+=, -=, *=, /=, %=) :
    var harga = 10_000
    harga += 2_000
    harga *= 2
    println(harga)

//  Unary operator(++, --, +, -, !):
    harga++
    harga++
    harga--
    println(harga)
}