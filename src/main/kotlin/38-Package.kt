//  to make source code easier to organized, just create package
//  package is similar with folder
//  package usually named with com.companyName.packageName.Specified, and using lowercase

//  by default, source code in package cannot be accessed by other source code outside
//  to access the source code in package, use keyword "import" followed with package name
//  we can access particular function in package by write its function name after package name
//  if we want to access all elements in package, use "*" after package and file name

import com.company.belajar.sayHello
//  com.company.belajar.* to access all function
fun main() {
    sayHello("Andika")
    //  without import, we can use this
    com.company.belajar.sayBye("Andika")
}