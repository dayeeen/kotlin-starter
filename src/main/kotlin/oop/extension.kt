package oop
fun String.hello() {
    print("Hello $this")
}

fun Int.kali(n: Int) : Int {
    return this*n
}

infix fun Int.tambah(x: Int) : Int {
    return this+x
}

val Int.slice: Int
    get() = this / 2

//Nullable Extension
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

fun main() {
//    val name: String = "Dayen"
//    print(name.hello())
//    "Dayen".hello()
    println(10.kali(5))
    print(2 tambah 5)

}