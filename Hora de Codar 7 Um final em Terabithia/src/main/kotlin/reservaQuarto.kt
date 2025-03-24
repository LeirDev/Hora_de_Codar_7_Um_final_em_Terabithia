//AAAAAAAAAAAAAAAAAAAAAAAA EU NAO AGUENTO MAIS AAAAAAAAAAAAAAAAAAAAAA
//RESERVA DE QUARTO
package hotel

fun reservaQuarto(nomeHotel: String, nomeUsuario: String) {
    println("_____RESERVA DE QUARTOS_____")
    var valorDiaria: Double
    var diasHospedagem: Int

    do {
        print("Qual o valor padrão da diária: ")
        valorDiaria = readln().toDoubleOrNull() ?: -1.0
        if (valorDiaria <= 0) {
            println("Erro, valor inválido $nomeUsuario, tente novamente.")
        }
    } while (valorDiaria <= 0)

    do {
        print("Quantas diárias serão necessárias: ")
        diasHospedagem = readLine()?.toIntOrNull() ?: -1
        if (diasHospedagem <= 0 || diasHospedagem >= 30) {
            println("Erro, valor inválido $nomeUsuario, tente novamente.")
        }
    } while (diasHospedagem <= 0 || diasHospedagem >= 30)

    val resultado = valorDiaria * diasHospedagem
    println("Valor de $diasHospedagem dias de hospedagem é de R$$resultado")

    println("Informe o nome do hospede: ")
    val nomeHospede = readLine()?: ""

    var quartoEscolhido: Int
    var quartoLivre = false

    do {
        print("Qual o quarto para reserva (1-20): ")
        quartoEscolhido = readln().toIntOrNull() ?: 0
        if (quartoEscolhido in 1..20){
            if (!quartos[quartoEscolhido - 1]){
                println("Quarto livre")
                quartoLivre = true
            }
            else{
                println("Quarto está ocupado, por favor escolha outro")
                exibirQuartos()
            }
        }
        else{
            println("Números de quartos inválido escolha entre 1 e 20")
        }
    }while (!quartoLivre)

    println("$nomeUsuario, você confirma a hospedagem para $nomeHospede por $diasHospedagem dias para o quarto $quartoEscolhido por R$${resultado} S/N ?")
    val confirmacao = readLine()?.uppercase()?: "N"

    if (confirmacao == "S"){
        quartos[quartoEscolhido - 1] = true
        println("$nomeUsuario, reserva efetuada para $nomeHospede.")
        exibirQuartos()
    }
    else{
        println("Reserva cancelada")
    }

}

fun exibirQuartos(){
    println("___LISTA DE QUARTOS___")
    print("   ")
    for (i in 0 until 20){
        val status = if (quartos[i]) "Ocupado" else "Livre"
        println("${i + 1} - $status;")
        if ( (i+1) % 5 == 0) println()
    }
    println()
}

