package variables

fun main(){
    print("Diga seu nome:")
    val name = readln() // por padrão o readln() recebe um dado tipo String

    println(name)

    val a = readln().toInt() // para que o dado seja trabalhado como Int
    val b = readln().toInt()

    var soma = a+b
    println(soma)
}
