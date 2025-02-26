fun main(){
    var choice = 0
    val contacts = mutableListOf<Map<String,String>>()

    do {
        showMenu()
        choice = getChoice()

        when (choice) {
            1 -> contacts.add(createContact())
            2 -> listContacts(contacts)
            3 -> println("Função para remover contatos")
            else -> println("Opção inválida")
        }
    } while (choice != 0)
    println("Até logo!")
}

fun showMenu(){
    println("===MENU===")
    println("1. Novo contato")
    println("2. Listar contatos")
    println("3. Remover contato")
    println("0. Sair")
}

fun getChoice(): Int{
    print("> ")
    return readln().toInt()
}

/* CRUD */

fun createContact() : Map<String, String> {
    print("Nome:")
    val name = readln()

    print("Telefone")
    val phonenumber = readln()

    println("Contato cadastrado com sucesso")
    return mapOf("name" to name, "phonenumber" to phonenumber)
}

fun listContacts(contacts: List<Map<String,String>>) {
    if (contacts.isEmpty()) {
        println("Nenhum contato cadastrado")
    }

    for (contact in contacts){
        println(contact.keys)
        println("[] Nome: ${contact["name"]} | Telefone: ${contact["phonenumber"]}")
    }
}
fun deleteContact() {}