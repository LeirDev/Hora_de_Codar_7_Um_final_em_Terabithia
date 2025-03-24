package hotel

import java.util.*

fun reservaEventos(nomeUsuario: String, nomeHotel: String){
    val laranja = 150
    val colorado = 350
    var nomeAuditorio = ""

    println("Qual o número de convidados para o seu evento? ")
    var convidados = readln().toIntOrNull() ?: 0

    if (convidados > 350 || convidados <= 0){
        println("Quantidade de convidados superior à capacidade máxima, tente novamente: ")
        convidados = readln().toIntOrNull() ?: 0
    }
    else{
        if (convidados >= 220){
            println("Use o auditório colorado")
            nomeAuditorio = "colorado"
        }
        else{
            val cadeiras = laranja - convidados
            println("Use o auditório laranja, (inclua mais $cadeiras cadeiras)")
            nomeAuditorio = "laranja"
        }
    }

    println("Agora vamos ver a agenda do evento")

    val semana  = arrayOf("segunda", "terca", "quarta", "quinta", "sexta")
    val fimDeSemana = arrayOf("sabado", "domingo")

    println("Qual o dia do seu evento? ")
    val dia = readln()
    var horarios = 1..10

    if (dia in semana){
        horarios = 7..22
    }
    else {
        horarios = 7..14
    }

    println("Qual o horário do seu evento? ")
    var horario = readln().toIntOrNull() ?: 0

    var nomeEmpresa = ""
    do{
        if (horario in horarios){
            println("Qual o nome da empresa? ")
            nomeEmpresa = readln()
            println("Auditório reservado para $nomeEmpresa. $dia às $horario hs.")
        }
        else{
            println("Horário indisponível, tente novamente")
        }
    }while (horario !in horarios)

    println("Qual a duração do evento em horas?")
    val duracao = readln().toIntOrNull() ?: 0

    val quantidadeDeGarcon = (convidados / 12) + (duracao / 2)
    val precoGarcon = quantidadeDeGarcon * 10.50

    println("""
        São necessários $quantidadeDeGarcon garçons.
        Custo: R$$precoGarcon
        
        Agora vamos calcular o custo do buffet do hotel para o evento.
    """.trimIndent())

    val litroCafe = convidados * 0.2
    val litroAgua = convidados * 0.5
    val quantidadeSalgado = convidados * 7

    println("O evento precisará de $litroCafe litros de café, $litroAgua litros de água, $quantidadeSalgado salgados. \n")

    val precoCafe = litroCafe * 0.80
    val precoAgua = litroAgua * 0.40
    val precoSalgado = (quantidadeSalgado / 100) * 34
    val totalBuffet = precoCafe + precoAgua + precoSalgado
    val valorTotal = precoGarcon + totalBuffet
    val horasTotal = horario + duracao

    println("""
        Evento no Auditório $nomeAuditorio.
        Nome da Empresa: $nomeEmpresa.
        Data: $dia, ${horario}H às ${horasTotal}h.
        Duração do evento: $duracao.
        Quantidade de garçons: $quantidadeDeGarcon.
        Quantidade de Convidados: $convidados.

        Custo do garçons: R$${precoGarcon}
        Custo do Buffet: R$${totalBuffet}

        Valor total do Evento: R$${valorTotal}
        
        Gostaria de efetuar a reserva? S/N
    """.trimIndent())

        val opcao = readln().uppercase(Locale.getDefault())

        if (opcao == "S"){
            println("$nomeUsuario, reserva efetuada com sucesso")
        }
        else{
            println("Reserva não efetuada.")
        }

}