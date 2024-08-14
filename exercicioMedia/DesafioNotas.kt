// desafio pratico - calculadora de Média Escolar




fun main(){
    // Declarando as médias escolares 
    val nota1 = 8.5
    val nota2 = 7.0
    val nota3 = 9.2

    // calcula 
    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)
    //println("A média e: $media")

    //formatando media escolar 
    println("A media e: $media ou mediaformatada $mediaFormatada")

}