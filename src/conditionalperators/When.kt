package conditionalperators

fun main() {
    println("Digite o número do mês")
    val month = readln().toInt()

    val name = when (month) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        else -> "Mês inválido"
    }
    println(name)
}