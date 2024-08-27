//desafio: calcular a soma dos numeros pares em uma lista de numeros
//criar uma lista de numeros e calcular a soma dos numeros pares

fun main() {
    // Criando a lista de números
    val lista = listOf(1, 2, 3, 4, 5, 6, 7)
    var resultado = 0

    // Iterando pela lista para somar os números pares
    for (i in lista) {
        if (i % 2 == 0) {
            resultado += i
        }
    }

    // Imprimindo o resultado da soma dos números pares
    println("A soma dos números pares na lista é: $resultado")
}
