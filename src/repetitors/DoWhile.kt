package repetitors

fun main() {
    var x = 20
    do{ // roda pelo menos uma vez antes de verificar a condição
        println(x)
        x++
    }while (x <= 10)
}