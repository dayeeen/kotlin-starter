package oop

//Nested Class
class House {
    // Properti outer class
    val buildingArea = 100
    val totalRooms = 5

    // Member class tidak dapat mengakses properti pada outer class
    // Maka cara yang tepat adalah dengan membuat inner class
    inner class Room {

        val totalRooms = 4
        fun measureRoomArea() {
            // Walau Variable totalRooms dimiliki outer class dan inner class
            // Namun yang Kotlin akan memilih yang inner class terlebih dahulu
            println("Inner Class: ${buildingArea/totalRooms}")
//          // Untuk mengakses properties dari outer class, gunakan qualified this.
            println("Outer Class: ${buildingArea/this@House.totalRooms}")
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}