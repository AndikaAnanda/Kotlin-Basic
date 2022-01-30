//  label is a marker
//  every expression in kotlin can be labelled
//  to use label, write label name, then add '@' after label name

//  beside a marker, label can integrate with break, continue, and return keyword
//  label is not recommended usually, if it used too much. because it will make your program confusing to read
fun main() {
    loop1@ for (i in 1..10){
        loop2@ for (j in 1..10){
            println("$i x $j = ${i * j}")
            //  usually, if we break here, by default, it will break loop within. but we can force break loop outside
            break@loop1
        }
    }

}