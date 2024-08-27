fun main (){
    println("digite numero inteiro positivo")
    val numero = readLine()!!.toInt()


    var soma = 0
    var contador = 3
    while (contador <= numero){
        soma += contador
        contador += 3
    }
    println("A soma dos multiplos de 3 atw $numero e : $soma")
}