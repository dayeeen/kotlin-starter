package com.dicoding.kotlin

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal() {
    var name: String by DelegateName()
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val Cat = Animal()
    Cat.name = "Mona"
    Cat.weight = 23.1
    println("Nama: ${Cat.name}, Berat: ${Cat.weight}, Umur: ${Cat.age}, mamalia: ${Cat.isMammal}" )
}