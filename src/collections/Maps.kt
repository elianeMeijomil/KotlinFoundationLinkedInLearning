package collections

fun main () {
    val m1 = mapOf("nome" to "Eliane", "idade" to 20, "Endereço" to "São Paulo")

    println(m1["nome"])
    println(m1["idade"])
    println(m1["Endereço"])

    val mm1 = mutableMapOf("nome" to "Elton", "endereco" to "São Paulo")
    println(mm1)

    println(mm1["nome"])
    println(mm1["endereco"])

    mm1["nome"] = "Elton Fonseca"
    println(mm1)
    mm1.put("telefone","(11) 99999-9999")
    println(mm1)

    for(i in mm1){
        println("${i.key} : ${i.value}")
    }
}