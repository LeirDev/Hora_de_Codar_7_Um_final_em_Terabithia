package hotel

//2) Como soletra?
//Aqui vamos tratar do cadastro de hóspedes.
//Imagine que uma família acaba de chegar ao balcão do hotel e quer se hospedar.
//Primeiro diremos ao programa o valor padrão da diária e só então cadastraremos todos os hóspedes.
//O programa receberá vários nomes de hóspedes e suas idades, sem limites.
//Caso o hóspede tenha menos de 6 anos, ela ou ele não paga a diária – nesses casos mostre na tela “[Nome do hóspede] possui gratuidade”.
//Caso o hóspede tenha mais de 60, ela ou ele paga metade da diária – mostre na tela “[Nome do hóspede] paga meia”.
//O usuário informará hóspedes até digitar a palavra “PARE”, que interrompe a entrada de dados.
//Ao fim, mostre a quantidade de gratuidades, a quantidade de meias hospedagens e o valor total, considerando todos os hóspedes informados.
fun cadastrorapido(nomeHotel: String, nomeUsuario: String){
    print("Qual o valor padrão da diária: ")
    val diaria = readln().toInt()
    var soma = 0
    var meia = 0
    var gratis = 0

    while (true){
        print("Qual o nome do hospede? ")
        val nome  = readln()
        if (nome.equals("PARE", ignoreCase = true)){
            break
        }
        else {
            print("Qual a idade do Hóspede? ")
            var idade = readln().toIntOrNull() ?: 0
            if (idade == 0){
                println("Idade inválida, por favor tente novamente.")
                idade = readln().toIntOrNull() ?: 0
            }
            else if (idade < 6) {
                println("$nome possui gratuiidade")
                gratis++
            } else if (idade > 60) {
                println("$nome paga meia")
                soma += diaria / 2
                meia++
            } else {
                soma += diaria
            }
            println("$nome cadastrada(o) com sucesso.")
        }
    }
    println("$nomeUsuario, o valor total das hospedagens é: R\$$soma; $gratis gratuidade(s); $meia meia(s)")
}