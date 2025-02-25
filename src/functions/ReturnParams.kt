package functions

fun main() {
    greeting("Padawan")
    greeting()

    // função imprime internamente
    sum(1.75,3.75)

    // função retorna valor
    val a = sum2(15.5, 7.2)
    println(a)

    // função que retorna valor pode ser chamada diretamente sem atribuir valor a variável
    // assim como pode-se usar uma ordem inversa na passagem de parametros
    println(divide(b=65.5,a=5.4))
}

private fun greeting(name: String = "visitante") { // private para não dar conflito no package
    println("Olá $name")
}

private fun sum(a: Double, b: Double){
    println(a + b)
}

private fun divide(a: Double, b: Double): Double {
    return a / b
}

private fun sum2(a: Double, b: Double): Double {
    return a + b
}