package oop

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

// Atau kita bisa juga menambahkan sebuah behaviour di dalam data class
data class DataUserLain(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}
fun main(){
    //    println(dataUser.equals(dataUser5))
//    val user = User("nrohmen", 17)
//    val dataUser = DataUser("nrohmen", 17)
//
//    println(user)
//    println(dataUser)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age= 12 )

    val dataUser6 = DataUserLain("dayen", 21)
    print(dataUser6.intro())


}