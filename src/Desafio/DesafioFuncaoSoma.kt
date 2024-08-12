// desafio soma de dois Quadrados 

fun somaDosQuadrados(a: Int, b: Int): Int {
    val resultado = a * a + b * b
    println("numero1: $a, Numero2: $b, Resultado: $resultado")
    return resultado
}

fun main() {
    val numerol = 3
    val numero2 = 4
    somaDosQuadrados(numerol, numero2)
}