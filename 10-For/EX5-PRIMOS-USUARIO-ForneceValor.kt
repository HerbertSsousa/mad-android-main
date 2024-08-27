fun main() {
    var isPrime = true
    
    println("Digite o número:")
    val usuarioInput = readLine()?.toIntOrNull()

    if (usuarioInput == null || usuarioInput < 2) {
        println("Por favor, insira um número inteiro maior que 1.")
        return
    }

    for (i in 2 until usuarioInput) {
        if (usuarioInput % i == 0) { // verifica se o número é divisível por i
            isPrime = false
            break
        }
    }

    // Após o loop, verifica o valor de isPrime para determinar se é primo ou não
    if (isPrime) {
        println("$usuarioInput é um número primo")
    } else {
        println("$usuarioInput não é um número primo")
    }
}
