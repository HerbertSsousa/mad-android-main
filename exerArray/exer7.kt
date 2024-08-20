fun main() {
    // criando uma lista mutavel de numeros inteiros vazia 

    val numeros = mutableListOf<Int>()

    //adicionando elementos a lista 
    numeros.add(1)
    numeros.add(2)
    numeros.add(3)


    //exibindo a lista de numeros 
    println("Lista de numeros: $numeros")


    //removendo um elemento da lista 
    numeros.removeAt(2)

    // Exibindo a lista apos a remocao
    println("Lista de numeros apos a remocao: $numeros")

}