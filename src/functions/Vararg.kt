package functions

fun main(){
 sum(1,3,7,5,9)
}

private fun sum(vararg values: Int){
    var num: Int = 0
    for(value in values ){
        num += value
    }
    println(num)
}