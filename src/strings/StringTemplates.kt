package strings

fun main() {
    val firstName = "Eliane"
    val lastName = "Meijomil"
    val fullName = "$firstName $lastName"//firstName + " " + lastName
    println(fullName)

    println("Digite um número num1:")
    val num1 = readln().toDouble()
    println("Digite um número num2:")
    val num2 = readln().toDouble()

    println("A soma de $num1 e $num2 é: ${num1+num2}")
}