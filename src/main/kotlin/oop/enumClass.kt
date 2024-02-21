package oop

// Enumeration Class
// Merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan
// kumpulan objek yang telah didefinisikan menjadi tipe data konstanta.

// Nilai-nilai berikut ini berpotensi tertukar
// val colorRed = 0xFF0000
// val colorGreen = 0x00FF00
// val colorBlue = 0x0000FF

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

fun main() {
//    val colors: Array<Color> = Color.values()
//    colors.forEach { color ->
//        print("$color ")
//    }
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
//    print(colorRed)
//    val color: Color = Color.valueOf("RED")
//    println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")

    // Cara yang lebih umum
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
    // Ordinal untuk menentukan posisi objek enum
    print("Position GREEN is ${color.ordinal}")

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

//enum class Colors{
//    RED, GREEN, BLUE
//}

//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}