// crioe programa verifica se o usuario possui ou nao carteira de habilitaçao 

fun main() {
    val idade = 25
    val possuiCarteiraDeMotorista = true 


    if(idade >= 18 && possuiCarteiraDeMotorista) {
        println("voce pode dirigir legalmente")
    }else {
        println("voce nao pode dirigir legalmente")
    }

    val temingresso = false
    val estaComCamisaDoTime = true 

    if (temingresso || estaComCamisaDoTime){
        println("voce pode entrar no estadio ")
    }else {
        println("vc nao pode entrar")
    }


}