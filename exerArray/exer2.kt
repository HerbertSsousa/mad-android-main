fun main() {


    //Declaracao de  um array 
    // var nomeDeVariavel = arrayOf(valor, valor, valor)

    val idades = arrayOf(8, 36, 42)


    //Acesso a uma posicao especifica do array
    println("O registro ZERO de idade e: ${idades[1]}")



    val alturas = FloatArray(256)

    //Outra forma de declaraçao e  atribuicao de valores 

    alturas[0] = 1.71f
    alturas[1] = 1.62f
    alturas[2] = 1.53f
    alturas[3] = 1.84f
    alturas[4] = 1.92f


// imporimindo o valor do primeiro registro de altura
println("O registro Zero de alturas e: %.2f".format(alturas[0]))
println("O registro Um de alturas e: %.2f".format(alturas[1]))
println("O registro Dois de alturas e: %.2f".format(alturas[2]))


//Outra forma de declaração de atribuicao de valor de um array
val nome = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G')
println("O ultimo caracter de nome e: ${nome[6]}")


//
val empresa = "FIAP"
println("Nome da empresa e: ${empresa[0]}")




//tamanho 
var tamanho: Int
tamanho = nome.size
println("Posicao do ultimo caractere de nome e: ${nome [tamanho -1]}")


//nos temos 3 posicoes de memoria sendo utilizadas
println("Quantidade de itens: ${idades.size}")


//qual o peso do array
println("Peso do array: ${idades.size * 4} bytes") // um int possui 4 bytes de tamanho

}