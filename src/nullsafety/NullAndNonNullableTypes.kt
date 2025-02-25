package nullsafety

fun main() {
    var a: Int = 20
    a = 25
    // a = null - gera erro

    var b : Int? = 20
    b = 30
    b = null
    // b.toInt() - gera erro

    println("$a - $b")
}