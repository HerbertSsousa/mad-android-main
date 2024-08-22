// programa que verifica se o usuario tem acesso ao sistema ou nao 

fun main(){

    println("Digite o nome de usuario:")
    val usuarioInput = readLine()


    println("Digite a senha:")
    val senhaInput = readLine()


    val usuario = "herbert"
    val senha = "1111"

    if(usuarioInput == usuario && senhaInput == senha){
        println("o usuario tem acesso")
    }else{
        println("o usuario nao tem acesso")
    }

}