fun main() {
    println("Escolha a escala de origem:")
    println("1. Celsius")
    println("2. Fahrenheit")
    println("3. Kelvin")
    print("Digite o número da escala de origem: ")
    val escalaOrigem = readLine()?.toIntOrNull()

    println("Escolha a escala de destino:")
    println("1. Celsius")
    println("2. Fahrenheit")
    println("3. Kelvin")
    print("Digite o número da escala de destino: ")
    val escalaDestino = readLine()?.toIntOrNull()

    print("Digite a temperatura a ser convertida: ")
    val temperatura = readLine()?.toDoubleOrNull()

    if (escalaOrigem == null || escalaDestino == null || temperatura == null) {
        println("Entrada inválida!")
        return
    }

    if (escalaOrigem == escalaDestino) {
        println("A escala de origem e a escala de destino são as mesmas. Temperatura: $temperatura")
        return
    }

    val resultado = when (escalaOrigem) {
        1 -> when (escalaDestino) {
            2 -> celsiusParaFahrenheit(temperatura)
            3 -> celsiusParaKelvin(temperatura)
            else -> null
        }
        2 -> when (escalaDestino) {
            1 -> fahrenheitParaCelsius(temperatura)
            3 -> fahrenheitParaKelvin(temperatura)
            else -> null
        }
        3 -> when (escalaDestino) {
            1 -> kelvinParaCelsius(temperatura)
            2 -> kelvinParaFahrenheit(temperatura)
            else -> null
        }
        else -> null
    }

    if (resultado != null) {
        println("Temperatura convertida: $resultado")
    } else {
        println("Conversão não suportada.")
    }
}

fun celsiusParaFahrenheit(celsius: Double): Double = (celsius * 9/5) + 32

fun celsiusParaKelvin(celsius: Double): Double = celsius + 273.15

fun fahrenheitParaCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5/9

fun fahrenheitParaKelvin(fahrenheit: Double): Double = (fahrenheit - 32) * 5/9 + 273.15

fun kelvinParaCelsius(kelvin: Double): Double = kelvin - 273.15

fun kelvinParaFahrenheit(kelvin: Double): Double = (kelvin - 273.15) * 9/5 + 32
