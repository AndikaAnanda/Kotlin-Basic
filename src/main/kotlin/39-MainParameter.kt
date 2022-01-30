//  by default, main function doesn't have arguments
//  but, if we want main function to be inputted by data outside, we can use parameter in main function
//  example : when we check java version in terminal by write java -version, "java" and "-version" is data from outside
//  so, "java" and "-version" will be inputted to main function with arguments

fun main(args: Array<String>) {
    //  this program will print inputted data (you can write it in debug configuration)
    for (value in args) {
        println(value)
    }
}