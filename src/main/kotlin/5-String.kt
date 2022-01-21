fun main() {
//  String adalah kumpulan Char yang digabungkan menjadi sebuah text, dan boleh tidak memiliki isi
    var firstName: String = "Andika"
    var lastName: String = "Ananda"

//  String concatenate adalah menambah string yang satu dengan yang lain
    println(firstName + " " + lastName)

//  String template berfungsi menambahkan unsur luar ke dalam string(lebih direkomendasikan dibanding concatenate)
    println("Nama saya adalah $firstName $lastName")
//  untuk operasi yang lebih kompleks, pakai { }
    println("Jumlah huruf pada nama depan : ${firstName.length}")
}