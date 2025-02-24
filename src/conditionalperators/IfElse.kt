package conditionalperators

fun main(){
    print("Digite a sua idade:")
    val age = readln().toInt() // aí do nada o instrutor resolveu nomear as variáveis em inglês
    val message = if( age >= 18){
        "Você pode tirar a carteira de motorista"
    } else if (age >= 16) {
        "Você ainda não pode tirar a carteira de motorista mas já pode votar"
    }else {
        "Vai ter que esperar mais um pouco pra tirar a carteira de motorista"
    }

    println(message)
}