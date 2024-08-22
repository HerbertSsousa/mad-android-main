// ex - maior ou menor de idade 
 
fun main() {
    //solicita ao usuario para digitar a idade
    println("Digite a idade:")
    val idadeInput = readLine()

    //verifica se a entrada e nula 
    if(idadeInput == null){
        println("entrada invalida")
        return
    }
    
    val idade = idadeInput.toIntOrNull()
    
    if(idade == null){
        println("idade invalida, por favor, insira um nome valido")
        return
    }

    
    if (idade >= 18){
        println("voce e maior de idade, pode encher a cara")
    } else{
        println("voce e menor de idade, nao pode beber")
    }
}