package hotel

//3) Com "S" ou com "Z"?
//Aqui vamos tratar do cadastro de hóspedes, mas de uma forma diferente.
//Como no programa anterior, imagine que uma família acaba de chegar ao balcão do hotel e quer se hospedar.
//Monte um programa em que o usuário poderá cadastrar e pesquisar hóspedes.
//O programa deve oferecer um menu com algumas opções ao usuário: 1- cadastrar; 2- pesquisar; 3-listar; 4- sair.
//A opção “cadastrar” deve permitir que o usuário informe um nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja essa quantidade, mostre “Máximo de cadastros atingido”).
//A opção “pesquisar” deve permitir que o usuário informe um nome e, caso seja encontrado um nome exatamente igual, mostre a mensagem “Hospede (nome) foi encontrado".
// Se o nome não foi encontrado mostre “Hóspede não encontrado”.
//A opção “listar” exibe todos os hóspedes do hotel um a um.
//O programa deve permitir que o usuário realize essas operações repetidas várias vezes, até que use a opção “4”, que retorna ao menu principal.

fun pequisaCadastro(nomeUsuario: String, nomeHotel: String) {
    val hospedes = mutableListOf<String>()

    while (true) {
        println("___CADASTRO DE HOSPEDES___")
        println("     1 - Cadastrar        ")
        println("     2 - Pesquisar        ")
        println("     3 - sair             ")
        println("    Escolha uma opção:    ")

        when (readln().toIntOrNull() ?: 0) {

            1 -> {
                print("Informe o nome do hospede: ")
                val nome_hospede = readln()
                hospedes.add(nome_hospede)
                println("Hóspede $nome_hospede foi cadastrada(o) com sucesso!")
            }

            2 -> {
                print("Informe o nome para consulta: ")
                val pesquisa = readln()
                val resultado = hospedes.any { it.equals(pesquisa, ignoreCase = true) }
                if (!resultado) {
                    println("Hóspede $pesquisa não foi encontrado")
                } else {
                    println("Hóspede $pesquisa foi encontrada(o)!")
                }
            }
            3-> break
            else -> println("Opção inválida")
        }
    }
}