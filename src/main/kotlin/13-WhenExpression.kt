fun main() {
//  When Expression is similar to switch case in other programming language
//  But, When Expression is more complex and has many forms

    val score = 'A'
    when(score) {
        'A' -> {
            println("Very good")
        } // If block isn't more than 1 line, dont use curly bracket
        'B' -> {
            println("good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Invalid")
        }
    }
//  Grouping option :
    when(score){
        'A', 'B', 'C' -> {
            println("pass")
        } else -> {
            println("fail")
        }
    }

//  If Else Replacement with When Expression:
    val scoreExam = 90
    when{
        scoreExam >= 90 -> {
            println("Highscore")
        }
        else -> {
            println("Lowscore")
        }
    }
//  When Expression In(check if variable exist in array) :
    val dataScore: Array<Char> = arrayOf('A', 'B', 'C')
    val score2 = 'B'
    when(score2){
        in dataScore -> println("pass")
        !in dataScore -> println("fail")
    }
//  When expression is(check if data type of variable is true or not) :
    val name: String = "Andika"
    when(name){
        is String -> {
            println("data type is string")
        }
        !is String -> {
            println("data type is not string")
        }
    }

}