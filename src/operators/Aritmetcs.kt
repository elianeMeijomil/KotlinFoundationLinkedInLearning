package operators

fun main () {
    // Define onstantes
    val a = 10
    val b = 5

    // Soma
    println( a + b )

    // Subtração
    println( a - b )

    // Multiplicação
    println( a * b )

    // Divisão
    println( a / b ) // retorna apenas inteiro entre dois inteiros
    println( a.toDouble() / b ) // garantindo que o resultado seja o valor exato

    // Módulo
    println( a % b )

    // Concatenação
    println( "eliane" + "Meijomil")
}