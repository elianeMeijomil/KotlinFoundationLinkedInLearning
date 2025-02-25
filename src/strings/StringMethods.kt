package strings

fun main() {
    val name = "Eliane Meijomil"

    println(name.reversed())

    println(name.lowercase())

    println(name.uppercase())

    println(name.equals("Eliane"))

    println(name.slice(0..2))

    println(name.length)

    println(name.get(10))

    println(name.startsWith("Eli"))

    println(name.endsWith("mil"))
}