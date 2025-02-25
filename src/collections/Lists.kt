package collections

fun main(){
    /*
    Imutable lists
    */
    val l1 = listOf("A","B","C")

    println(l1)
    println(l1[3])

    // l1.add("d") // não é possível adicionar ítens em uma imutable list
    for (i in l1){
        println(i)
    }


    /*
    Mutable lists
    */
    val ml1 = mutableListOf("a","b","c")
    println(ml1)
    println(ml1[0])

    ml1.add("d") // adiciona mais um ítem à lista mutável

    for(i in ml1){
        println(i)
    }
}