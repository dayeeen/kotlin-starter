package oop

import oop.DataUser

// Destructuring Declarations
fun main(){
    val dataUser = DataUser("Dayen", 17)

//    val name = dataUser.component1()
//    val age = dataUser.component2()

    // Atau bisa disingkat menjadi seperti berikut:
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}