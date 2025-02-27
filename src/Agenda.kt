fun main(){
    var choice = 0
    val contacts = mutableListOf<Map<String,String>>()

    do {
        showMenu()
        choice = getChoice()

        when (choice) {
            1 -> contacts.add(createContact())
            2 -> listContacts(contacts)
            3 -> {
                var deleteNumber : String = deleteContacts(contacts)
                try {
                    contacts.removeAt(deleteNumber.toInt()-1 )
                    println("\n==============================")
                    println("Registro removido com sucesso!")
                    println("==============================\n")
                } catch (e:NumberFormatException){
                    println("Por favor, digite um número")
                } catch(e: IndexOutOfBoundsException){
                    println("\n==============================")
                    println("Registro não encontrado")
                    println("==============================\n")

                }
            }
            else -> println("Opção inválida")
        }
    } while (choice != 0)
    println("\n==============================")
    println("           Até breve!")
    println("==============================\n")
}

fun showMenu(){
    println("\n==============================")
    println("=========== MENU =============")
    println("==============================\n")
    println("1. Novo contato")
    println("2. Listar contatos")
    println("3. Remover contato")
    println("0. Sair")
}

fun getChoice(): Int{
    print("> ")
    var choice = 0
    try {
        choice = readln().toInt()
    } catch (e:NumberFormatException){
         //Log("Opção inválida")
    }
    return choice ?: 0
}

/* CRUD */

fun createContact() : Map<String, String> {
    print("Nome:")
    val name = readln()

    print("Telefone")
    val phonenumber = readln()

    println("Contato cadastrado com sucesso")
    //return mapOf("id" to id, "name" to name, "phonenumber" to phonenumber)
    return mapOf("name" to name, "phonenumber" to phonenumber)
}

fun listContacts(contacts: List<Map<String,String>>) {
    if (contacts.isEmpty()) {
        println("Nenhum contato cadastrado")
    }
    try {
        for ((index,contact) in contacts.withIndex()) {
            print("[${index+1}]: ")
            for (key in contact.keys) {
                print("$key: "+contact[key]+" |")
            }
        println()
        //println("Nome: ${contact["name"]} | Telefone: ${contact["phonenumber"]}")
        }
    } catch (e:Exception){
        println("Deu ruin!")
    }
}

fun deleteContacts(contacts: List<Map<String,String>>) : String{
    listContacts(contacts)
    println("digite o número do contato que que deseja remover")
    print(" > ")
    return (readln())
}