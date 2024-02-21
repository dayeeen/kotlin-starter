package oop

// Companion Object
// Berbeda dengan class, Anda tidak dapat membuat inner object secara langsung di dalam class.
// Untuk mengatasinya, Anda perlu menambahkan Companion Object seperti berikut.
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

fun main() {
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)
}