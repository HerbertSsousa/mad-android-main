// sistema de geraçao de comanda para lanchonete 
//inicie criando variaveis para o controle de preço e quantidade de produto 
//Exibir, A quantidade e preco dos produtos, soma, taxa e o total 

fun main() {

    //As variáveis precoCoxinha e precoCerveja armazenam os preços das coxinhas e cervejas, respectivamente.
    var precoCoxinha = 3.50
    var precoCerveja = 15.50

    //As variáveis qtdeCoxinha e qtdeCerveja armazenam as quantidades de coxinhas e cervejas, respectivamente.
    var qtdeCoxinha = 3
    var qtdeCerveja = 2
   
    //totalCoxinha é calculado multiplicando a quantidade de  coxinhas pelo preço de uma coxinha.
    var totalCoxinha = qtdeCoxinha * precoCoxinha
    
    //totalCerveja é calculado multiplicando a quantidade de cervejas pelo preço de uma cerveja.    
    var totalCerveja = qtdeCerveja * precoCerveja

    //valorTotal é calculado somando os valores totais das coxinhas e cervejas.
    var valorTotal = totalCoxinha + totalCerveja

    //taxaServico é calculada como 10% do valorTotal.
    var taxaServico = valorTotal * 0.10
        
    //valorCobrado é calculado somando o valorTotal e a taxaServico.
    var valorCobrado = valorTotal + taxaServico

    println("\t .: Lanchonete Vinny :.")
    println("---------------------------------")
    println("$qtdeCoxinha coxinhas\t\t R$ %.2f".format(totalCoxinha))
    println("$qtdeCerveja cervejas\t\t R$ %.2f".format(totalCerveja))
    println("Somatoria\t\t R$ %.2f".format(valorTotal))
    println("---------------------------------")
    println("Taxa 10%%\t\t R$ %.2f".format(taxaServico))
    println("---------------------------------")
    println("Conta Final\t\t R$ %.2f".format(valorCobrado))
    
    //Lembre-se de que em Kotlin, a impressão é feita usando println() e a formatação é realizada usando format().

}