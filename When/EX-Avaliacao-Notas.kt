// avaliacao de notas 

fun main(){
    //definir nota 
    val nota = 80  // aluno tirou nota 

    //usando o when avaliar o conceito da nota

    val conceito = when (nota) {
        in 0..49 -> "F" // se ferrou muito
        in 50..59 -> "D" // se ferrou muito
        in 60..69 -> "C" // se ferrou mas passou
        in 70..79 -> "B" // se deu bem
        in 80..100 -> "A" // foi muito bem 
        else -> "Nota invalida"

    } 
        //Exibindo 
        println("Resultado: $conceito")


}