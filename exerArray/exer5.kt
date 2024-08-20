//exer: busca elementos 


fun main() {
    //Array de strings
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" // ELemento a ser buscado
    var found = false // variavel para verificar se foi encontrado


// Loop para verificar se o elemento esta presente
    for (name in names){
        if (name == searchName) {
            found = true 
            break
        }
    }



if (found) {
    println("$searchName foi encontrado no array.")

    }else {
        println("$searchName nao foi encontrado no arrya.")

    }

}