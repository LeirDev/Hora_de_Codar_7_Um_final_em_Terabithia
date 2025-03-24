package hotel

data class Informacoes (
    val nomeEmpresa: String,
    val valorAparelho: Double,
    val quantidadeAparelhos: Double,
    val desconto: Double,
    val minimoAparelhosDesconto: Double,
    val valorTotalComDesconto: Double
)

val empresasManutencao = mutableListOf<Informacoes>()

fun manutencaoAr(nomeUsuario: String, nomeHotel: String){

do {
        println("Qual o nome da empresa?")
        val nomeEmpresa = readln()
        println("Qual o valor por aparelho?")
        val valorAparelho = readln().toDouble()
        println("Qual a quantidade de aparelhos?")
        val quantidadeAparelhos = readln().toDouble()
        println("Qual a porcentagem de desconto?")
        val desconto = readln().toDouble()
        println("Qual o número mínimo de aparelhos para conseguir o desconto?")
        val minimoAparelhosDesconto = readln().toDouble()

        val valorTotalComDesconto = if (quantidadeAparelhos >= minimoAparelhosDesconto) {
            valorAparelho * quantidadeAparelhos * (1 - desconto / 100)
        } else {
            valorAparelho * quantidadeAparelhos
        }

        empresasManutencao.add(Informacoes(nomeEmpresa, valorAparelho, quantidadeAparelhos, desconto, minimoAparelhosDesconto, valorTotalComDesconto))

        println("Deseja informar novos dados, $nomeUsuario? (S/N)")
        var opcao = readln().uppercase()


        } while (opcao == "S")

        val melhor = empresasManutencao.minByOrNull { it.valorTotalComDesconto }
        if (melhor != null){
            println("""
                Melhor Empresa: ${melhor.nomeEmpresa}
                Valor total com desconto: ${melhor.valorTotalComDesconto}
                Quantidade de aparelhos: ${melhor.quantidadeAparelhos}
            """.trimIndent())
        }
}