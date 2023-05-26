fun main() {
    //Exercicio1

    var numero1=2
    for (n in 1..10) {
        var resultado = numero1*n
        println("$numero1 + $n =$resultado")
    }

//
//    //Exercicio 3
    var n4= 1
    for (n4 in 1000..2000){
        if (n4%11 ==2){
            println("Da para dividir por 11 e sobra 2")
        } else{
            println("Nao se encaixa")
        }
    }

    //Exercicio 6

    val c1 = 2000
    val c2 = 500
    val c3 = 250
    val c4 = 150
    val c5 = 2500
    val valor = c1 + c2 + c3 + c4 + c5

    println(
        if (valor == 5400) {
            "Valor atingido"
        } else if (valor > 5400) {
            "Valor Superado"
        } else {
            "Valor nao atingido"
        })


    //Exercicio
    val idades= listOf(10,20,30,40,50,50,60,70,70,80)
    var contador = 0

//    for (idade in idades){
    for (indice in 0 until idades.size){
        val idade = idades[indice]
        if (idade >=18){
            contador=contador+1

        }
    }
    println(contador)


    //Exercicio 11
    val n11= 2

    when {
        n11%2 ==0 ->
            println("par")
        else ->
            println("impar")}

//    Exercicio 16
    val idades2= listOf(10,20,30,40,50,50,60,70,70,80,90,100,15,20,30,50,17,18,19,20,21,22,23,24,25)
    var contador2 = 0
    val pesos = listOf(20,30,50,60,65,70,75,80,85,40,45,50,13,14,15,16,17,18,19,20,21,22,23,24,25)
    val alturas = listOf(120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150)
    //indice = posicao
    //size = tamanho da lista
    //items = literalmente os itens
    var somarAltura = 0
    var contador3 = 0
    var contador4 = 0

    for (indice in 0 until idades2.size){
        val idade = idades2[indice]
        val altura = alturas[indice]
        val peso = pesos[indice]
        if (idade >=50){
            contador2=contador2+1
        }
        if (idade in 10 .. 20){
            somarAltura=somarAltura+altura
            contador3=contador3+1
        }
        if (peso <40){
            contador4=contador4+1
        }
    }
    println("A quantidade de pessoas com idade >=50: $contador2")
    println("A media das alturas: ${somarAltura/contador3}")
    println("A porcentagem das pessoas com peso inferior a 40: ${(contador4*100)/pesos.size}%")

//
//    var porcentagem = 0
//    val porcentagem2 = 100
//    var resutldo=(porcentagem+1)/porcentagem2
//        for (pesos in peso) {
//            if (pesos <= 40) {
//                println("$resutldo")
//            }
//        }

    //Exercicio 19
    val n19= listOf(10,20,30,40,50,50,60,70,70,80)
    var intervalo = 0

    for (indice in 0 until n19.size){
        val n20 = n19[indice]
        if (n20 in 30..90){
            intervalo=intervalo+1

        }
    }
    println(intervalo)


}

