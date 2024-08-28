import java.util.*

fun main (){
    val scanner = Scanner(System.`in`)
    var sair: Char

    do {
        coletarDados()
        println("Tecle [c] para continuiar ou [s] para sair:")
        sair = scanner.next()[0]
    }while (sair != 's')


}


fun coletarDados() {
    val scanner = Scanner(System.`in`)
    var peso: Float 
    var altura: Float

    println("Digite o seu peso: ")
    peso = scanner.nextFloat()

    println("Digite a sua altura: ")
    altura = scanner.nextFloat()


   val imc = calcularIMC(peso, altura)
   println("Seu IMC e: %.2f | ".format(imc))



    when {
        imc < 18.5 -> println("Excesso de Magreza")
        imc < 25 -> println("Peso Normal")
        imc < 30 -> println("Excesso de Peso")
        imc < 35-> println("Obesidade - Grau I")
        imc < 40-> println("Obesidade - Grau II")
        else -> println("Obesidade - Grau III")
       
    }
}


fun calcularIMC(peso: Float, altura: Float): Float {
    val resultado = peso / (altura * altura)
    return resultado
}