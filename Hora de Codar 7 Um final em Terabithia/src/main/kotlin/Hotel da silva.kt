package hotel


val quartos = Array(20) { false }
val hospedes = mutableListOf<String>()

fun main() {
    val nomeHotel = "Hotel Da Silva"
    var nomeUsuario = ""

    println("Bem vindo ao $nomeHotel")

    if (!login()) {
        println("Acesso negado encerrando o sistema")
        return
    }

    print("Informe o nome: ")
    nomeUsuario = readLine() ?: ""
    println("Bem vindo ao hotel $nomeHotel, $nomeUsuario!!!")

    var opcao: Int
    do {
        println("Menu:")
        println("1. Reserva de Quarto")
        println("2. Cadastro de Hóspedes")
        println("3. Pesquisa de Cadastro")
        println("4. Reserva de Eventos")
        println("5. Combustível")
        println("6. Manutenção de Ar")
        println("0. Sair")
        opcao = readLine()?.toIntOrNull() ?: 0
        when (opcao) {
            1 -> reservaQuarto(nomeHotel, nomeUsuario)
            2 -> cadastrorapido(nomeHotel, nomeUsuario)
            3 -> pequisaCadastro(nomeHotel, nomeUsuario)
            4 -> reservaEventos(nomeHotel, nomeUsuario)
            5 -> combustivel(nomeUsuario)
            6 -> manutencaoAr(nomeHotel, nomeUsuario)
            0 -> println("Muito obrigado e até logo, $nomeUsuario")
            else -> erro(nomeUsuario)
        }
    } while (opcao != 0)
}


fun erro (nomeUsuario: String) {
    println("$nomeUsuario, opção inválida. Por favor, escolha uma opção válida.")
    main()
}

fun login(): Boolean {
    var tentativas = 3
    while (tentativas > 0){
        print("Digite sua senha: ")
        val senha = readLine()
        if (senha == "2678"){
            return true
        } else{
            tentativas--
            println("Senha incorreta, você tem mais $tentativas tentativas.")
        }
    }
    return false
}







