fun main() {
// Solicitação de entrada de dados ao usuário
println("Digite o nome:")
val nome = readLine()!!

println("Digite a idade:")
val idade = readLine() !!.toInt()

println("Digite o email:")
val email = readLine()!!

println("O usuário está ativo? (true/false):")
val usuarioAtivo = readLine()!!. toBoolean()

// Exibição das informações no console printin ("Nome: $nome")
println("Nome: $nome")
println("Idade: $idade")
println("Email: $email")
println("Usuario Ativo: $usuarioAtivo")

}