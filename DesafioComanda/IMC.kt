//Cálculo do Índice de Massa Corporal (IMC)
//Desenvolver um programa em Kotlin que calcule o Índice de Massa Corporal (IMC) com base no
//peso e na altura fornecidos pelo usuário.
//O programa deve realizar as seguintes tarefas:
//1. Criar um objeto Scanner para ler a entrada do usuário.
//2. Definir uma função chamada coletarDados() que solicite e leia o peso e a
//altura do usuário.
//3. Calcular o IMC utilizando a fórmula IMC = peso / (altura * altura
//Utilizar uma estrutura when para determinar a categoria do IMC com base nos seguintes critérios:
//IMC < 18.5: Excesso de Magreza
//18.5 <= IMC < 25: Peso Normal
//25 <= IMC < 30: Excesso de Peso
//30 <= IMC < 35: Obesidade - Grau I
//35 <= IMC < 40: Obesidade - Grau II
//IMC >= 40: Obesidade - Grau III
//Exibir o resultado do IMC com duas casas decimais e a categoria correspondente.
//Obs.: O programa deve permitir ao usuário continuar ou sair após cada cálculo do IMC.
//Escreva o código Kotlin para realizar essas operações e exibir os resultados conforme as
//especificações."

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