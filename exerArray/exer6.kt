// exer: inversao de array

fun main() {
    //array original 
    val originalArray = arrayOf(1,2,3,4,5)
    val reversedArray = originalArray.reversedArray() // array invertido

// array original: 1,2,3,4,5
    println("Array original: ${originalArray.joinToString()}")

//array inveritdo: 5,4,3,2,1
    println("Array invertido: ${reversedArray
    .joinToString()}")

}