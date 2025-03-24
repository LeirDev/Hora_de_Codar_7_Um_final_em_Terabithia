package hotel




//Código após receber ajuda do professor Gabriel
fun combustivel (nomeUsuario: String){

    //Posto Wayne Oil
    println("Qual o valor do álcool no posto Wayne Oil?")
    val alcoolWayne = readln().toDouble()
    println("Qual o valor da gasolina no posto Wayne Oil?")
    val gasolinaWayne = readln().toDouble()


    //Posto Stark Petrol
    println("Qual o valor do álcool no posto Stark Petrol?")
    val alcoolStark = readln().toDouble()
    println("Qual o valor da gasolina no posto Stark Petrol?")
    val gasolinaStark = readln().toDouble()

    //A melhor opção
    val postoGasolina = if (gasolinaWayne < gasolinaStark) "Wayne Oil" else "Stark Petrol"
    val postoAlcool = if (alcoolWayne < alcoolStark) "Wayne Oil" else "Stark Petrol"
    val precoGasolina = if (gasolinaWayne < gasolinaStark) gasolinaWayne else gasolinaStark
    val precoAlcool = if (alcoolWayne < alcoolStark) alcoolWayne else alcoolStark

    if (precoGasolina <= precoAlcool * 0.7){
        println("$nomeUsuario, é mais barato abastecer com gasolina no posto $postoGasolina")
    }
    else{
        println("$nomeUsuario, é mais barato abastecer com gasolina no posto $postoAlcool")
    }
}


//código usando IA para aprender
//fun combustivel(nomeUsuario: String){
//
//    var melhorOpcaoWayneAlcool = ""
//    var melhorOpcaoGasolina = ""
//
//    //Posto Wayne Oil
//    println("Álcool ou gasolina?")
//
//    // POSTO WAYNE OIL
//    println("Qual o valor do álcool no posto Wayne Oil")
//    val alcoolWayne = readln().toDouble()
//    println("Qual o valor da gasolina no posto Wayne Oil")
//    val gasolinaWayne = readln().toDouble()
//
//    val melhorOpcaoWayne = if (alcoolWayne * 0.7 < gasolinaWayne) "Gasolina" else "Alcool"
//
//
//    //Posto Stark Petrol
//    println("Qual o valor do álcool no posto Stark Petrol?")
//    val alcoolStark = readln().toDouble()
//    println("Qual o valor da gasolina no posto Stark Petrol?")
//    val gasolinaStark = readln().toDouble()
//
//    val melhorOpcaoStark = if (alcoolStark * 0.7 < gasolinaStark) "Gasolina" else "Alcool"
//
//    val custoStark = if (melhorOpcaoStark == "Gasolina") gasolinaStark * 42 else alcoolStark * 42
//    val custoWayne = if (melhorOpcaoWayne == "Gasolina") gasolinaWayne * 42 else alcoolWayne * 42
//
//    if (custoWayne < custoWayne) {
//        println("$nomeUsuario, é mais barato abastecer com $melhorOpcaoWayne no posto Wayne Oil.")
//    }
//    else{
//        println("$nomeUsuario, é mais barato abastecer com $melhorOpcaoStark no posto Stark Petrol.")
//    }

    //------------------------------------código sem IA-------------------------------------------------------
    //if (melhorOpcaoWayne == "Gasolina" && melhorOpcaoStark== "Alcool"){
    //        if (alcoolStark * 0.7 < gasolinaWayne){
    //            println("$nomeUsuario, é mais barato abastecer com gasolina no posto Wayne Oil ")
    //        }
    //        else{
    //            println("$nomeUsuario, é mais barato abastecer com álcool no posto Stark Petrol")
    //        }
    //    }else if (melhorOpcaoWayne == "Alcool" && melhorOpcaoStark == "Gasolina"){
    //        if (alcoolWayne * 0.7 < gasolinaStark){
    //            println("$nomeUsuario, é mais barato abastecer com gasolina no posto Stark Petrol")
    //        }
    //        else{
    //            println("$nomeUsuario, é mais barato abastecer com álcool no posto Wayne")
    //        }
    //    }else if (melhorOpcaoWayne == "Alcool" && melhorOpcaoStark == "Alcool"){
    //        if (alcoolStark < alcoolWayne){
    //            println("$nomeUsuario, é mais barato abastecer com álcool no posto Stark Petrol")
    //        }
    //        else{
    //            println("$nomeUsuario, é mais barato abastecer com álcool no posto Wayne Oil")
    //        }
    //    }
    //    else{
    //        if (gasolinaStark < gasolinaWayne){
    //            println("$nomeUsuario, é mais barato abastecer com gasolina no posto Stark Petrol")
    //        }
    //        else{
    //            println("$nomeUsuario, é mais barato abastecer com gasolina no posto Wayne Oil")
    //        }
    //    }






//}