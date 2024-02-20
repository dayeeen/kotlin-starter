class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
//    val user = User("nrohmen", 17)
//    val dataUser = DataUser("nrohmen", 17)
//
//    println(user)
//    println(dataUser)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
}