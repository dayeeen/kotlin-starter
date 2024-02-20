package com.dicoding.kotlin

class GetterSet(name: String) {
    var name: String = name
        get() {
            println("Anda memanggil getter")
            return field
        }
        set(value) {
            if(value.isNotBlank())
            {
                println("Anda memanggil setter")
                field = value
            } else {
                println("Value has not been set")
            }
        }
}

class BigName(val title: String) {
    val bigN: String
        get() = title.toUpperCase()
}

fun main() {

}