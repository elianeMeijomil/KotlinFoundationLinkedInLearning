package repetitors

fun main() {
    for( i in 0 .. 50){
        if( i % 7 != 0)
            continue
        println(i)
    }

    for( i in 1 .. 50){
        if( i % 7 == 0 && i % 5 == 0)
            break
        println(i)
    }
}