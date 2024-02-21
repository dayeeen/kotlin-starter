package oop

// Set
// Merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik
// Tujuannya untuk menghindari duplikasi data

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 4, 2, 5)
    println(setA == setB)
    print(5 in setA)

    // Ada fungsi union dan intersect nya juga coyyy
    // Yang biasa dipelajari di matkul matdis
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah mutableSet
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1


}