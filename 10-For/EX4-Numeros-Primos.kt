fun main() {

    val num = 17
    var isPrime = true // variavel como true assumindo inicialmente que é primo

    for (i in 2 until num){
        if (num % i == 0){ //verifica se e um numero divisivel por i
            isPrime = false
            break
        }
    }
    //após o loop verif o valor isPrime para determinar se e primo ou nao
    if (isPrime){
        println("$num e um numero primo")
    }else {
        println("$num nao é um numero primo")
    }
}