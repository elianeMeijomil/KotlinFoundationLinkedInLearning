package operators

fun main(){
    // Conjunção (E)
    println(true && true)
    println(true && false)
    println(false && true)
    println(false && false)

    println("-----------------------------------------------------")

    // Disjunção (OU)
    println(true || true)
    println(true || false)
    println(false || true)
    println(false || false)

    println("-----------------------------------------------------")

    // Negação (NÃO)
    println(!true)
    println(!false)

    /*
     * tem que inventar de fazer um código com o que já aprendeu, né? :)
     */
    var idade = readln().toInt()
    while(idade!=0) {
        println(idade >= 20 && idade < 50)
        idade = readln().toInt()
    }


}