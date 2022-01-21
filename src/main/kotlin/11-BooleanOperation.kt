fun main() {
//  Boolean operation is consist of &&(and), ||(or), !(negation)
    val exam = 90
    val presence = 60

    val passExam = exam > 80
    val passPresence = presence > 80

    val passRes = passExam && passPresence
    println(passRes)
}