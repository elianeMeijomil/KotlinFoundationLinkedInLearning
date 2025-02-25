package strings

fun main() {
    /*
    Uma string
    com multiplas
    linhas
     */

    // texto sem espaços
    val message = "Uma string" +
            "com multiplas" +
            "linhas"
    println(message)
    val name = "Eliane"
    // String Literals leva as quebras de linha em consideração
    val secondmessage = """
        Uma string
        com multiplas
        linhas $name
    """.trimIndent()
    println(secondmessage)
}