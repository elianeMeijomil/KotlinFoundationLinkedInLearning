package nullsafety

fun main() {

    var name: String? = "Eliane Meijomil"
    lengthname(name)

    name = null
    lengthname(name)
}

fun lengthname(name : String?){
    var length = name?.length ?: 0
    println(length)
}