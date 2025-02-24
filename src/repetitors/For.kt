package repetitors

fun main() {
    for( i in 0 .. 10){
        println(i)
    }
    for( i in 0 ..<10){
        println(i)
    }

    for( i in 10 downTo 1 step 2){
        println(i)
    }
}