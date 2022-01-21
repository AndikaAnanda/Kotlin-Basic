fun main() {
//  array is set of data
//  data type in array contents must be 1 type
//  array size is not dinamic, we can't increase or decrease its element

    val arrayAngka: Array<Int> = arrayOf(10, 2, 3, 5, 9)

//  access array :
    println(arrayAngka[0])

//  modify array :
    arrayAngka.set(1, 10)
    arrayAngka[4] = 5

//  basically in kotlin, array value can't be null. But we can create nullable array
    val arrayHuruf: Array<Char?> = arrayOfNulls(4)
    arrayHuruf.set(0, 'a')
    arrayHuruf.set(1, null)
    arrayHuruf.set(2, 'r')
    arrayHuruf.set(3, null)

//  determine size of array :
    println(arrayHuruf.size)
    println(arrayAngka.size)

}