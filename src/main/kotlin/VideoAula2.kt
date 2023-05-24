//Exercicio 1


fun idadeNomes(idade: String): String {
    val idademin = "2"
    val idademedia = "4"
    val idademax = "5"

    val idadecoelhos = if (idade == idademin) {
        "2 anos"
    } else if (idade == idademedia) {
        "4 anos"
    } else if (idade == idademax) {
        "5 anos"
    } else {
        "Idade errada"
    }
    return idadecoelhos
}


fun main() {
    for (y in 0..7) {
        println("$y Hello, world!")
        //usa $ na frente da variavel quando quer colocar ela dentro de uma string
    }

    //Exercicio 2
    val coelhos = mutableListOf(
        "Jose",
        "Dani",
        "Amy",
        "Hanna",
        "Pink",
        "Mingau"
    )
    coelhos.add("Frida")
    //para adionar um elemento na lista colocar nome da variavel.add("Elemento")
    for (y in coelhos.indices) {
        //val c = coelhos.size -1 (abaixo de coelhos.add)
        //for (i in 0..c){-> range = intervalo de valores em kotlin (abaixo de val c...)
        // -1 pois o zero conta como numero
        println(coelhos[y])
    }

    //Exercicio 2.1
    val coelhos2 = mutableListOf(
        "Jose",
        "Dani",
        "Amy",
        "Hanna",
        "Pink",
        "Mingau")
    coelhos.add("Frida")
    for (coelhos2 in coelhos2) {
        println(coelhos2)
    }
    //fazer a variavel assumir o valor dentro do proprio conjnto de coelhos - nao vou mais explorar
    // os indices da lista coelhos, mas os valores da lista

    //Exercicio 3
    val nomeCoelhos = listOf("Jose:","Dani:","Amy:","Hanna:","Pink:","Mingau:","Frida:")
    val idades = listOf("2","2","4","4","4","5","2")
    for (c in idades.indices){
       println("${nomeCoelhos[c]} ${idadeNomes(idades[c])}")
    }

//    var iJose = "2"
//    var iDani = "2"
//    var iAmy = "4"
//    var iHanna = "4"
//    var iPink = "4"
//    var iMingau = "5"
//    var iFrida = "2"

//    println(idadeNomes(iJose))
//    println(idadeNomes(iDani))
//    println(idadeNomes(iAmy))
//    println(idadeNomes(iHanna))
//    println(idadeNomes(iPink))
//    println(idadeNomes(iMingau))
//    println(idadeNomes(iFrida))

}