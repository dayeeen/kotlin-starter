package oop

// List
// List bersifat immutable atau tidak dapat diubah
// Namun KSL menyediakan fungsi mutableListOf untuk membuat suatu list dapat diubah
fun main() {
    // val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    // Kompiler secara otomatis akan mengetahui tipe data yang ada dalam sebuah objek list
    // Maka cukup tulis syntax seperti berikut
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = mutableListOf('a', "Kotlin", 3, true, DataUser("Dayen", 12))
    print(anyList[4])
    anyList.add("Last thing!")
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0

    // Perbedaan List dan Array
    val array = arrayOf("Kotlin", "Java")
    array[0] = "Dart" // no error
    // array.add("JavaScript") // error

    val list = listOf("Kotlin", "Java")
    // list[0] = "Dart" // error
    // list.add("JavaScript") // error

    val mutableList = mutableListOf("Kotlin", "Java")
    mutableList[0] = "Dart" // no error
    mutableList.add("JavaScript") // no error

    val arrayList = arrayListOf("Kotlin", "Java")
    arrayList[0] = "Dart" // no error
    arrayList.add("JavaScript") // no error
}