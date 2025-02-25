package NullSafety

fun main(){
    var name: String? = "Eliane Meijomil"

    // com if
    if(name != null)
        println(name.length)

    name = null
    // linear
    println(name?.length)
}