package NullSafety

fun main() {
    val name: String? = "Eliane Meijomil"
    val reversed = name!!.reversed() // garanto que não seja nulo

    println(reversed)
}