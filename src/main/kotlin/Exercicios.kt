import java.util.SimpleTimeZone

fun main(args: Array<String>) {

    //Exercicio 1
    val n1 = 1
    val n2 = 3

    if (n1 > n2) {
        println("n1")
    } else {
        println("n2")
    }

    //Exercicio 2
    val n3 = 4
    if (n3 > 0) {
        println("Positivo")
    } else {
        println("Negativo")
    }

    //Exercicio 3
    var n4 = "F"

    if (n4 == "F") {
        println("Feminino")
    } else if (n4 == "M") {
        println("Masculino")
    } else {
        println("Sexo inválido")
    }

    //Exercicio 4
    var n5 = "a"
    println(
        if (n5 == "a" || n5 == "e" || n5 == "i" || n5 == "o" || n5 == "u") {
            "Vogal"
        } else {
            "Consoante"
        }
    )

    //Exercicio 5
    val nota1 = 4;
    val nota2 = 6
    var n6 = (nota1 + nota2) / 2

    println(
        if (n6 >= 7) {
            "Aprovado"
        } else if (n6 == 10) {
            "Aprovado com Distinção"
        } else {
            "Reprovado"
        }
    )

    //Exercicio 8
    // Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
    // sabendo que a decisão é sempre o mais barato.
    val produto1 = 10.00
    val produto2 = 15.00
    val produto3 = 20.00
    val produto4 = 25.00

    var valorproduto = produto3
    println(
        if (produto1 < produto2 && produto1 < produto3 && produto1 < produto4) {
            "Comprar produto 1"
        } else if (produto2 < produto1 && produto2 < produto3 && produto2 < produto4) {
            "Comprar produto 2"
        } else if (produto3 < produto1 && produto3 < produto2) {
            "Comprar produto 3"
        } else {
            "Comprar produto 3"
        }
    )

    //Exercicio 10
    var n7 = "M"

    println(if (n7 == "M") {
        "Matutino"
    } else if (n7 == "V") {
        "Vespertino"
    } else if (n7 == "N") {
        "Noturno"
    } else {
       "Valor invalido"})

    //Exercicio 13
    val n8 = 3
    println(
        if (n8 == 1) {
            "Domindo"
        } else if (n8 == 2) {
            "Segunda"
        } else if (n8 == 3) {
            "Terça"
        } else if (n8 == 4) {
            "Quarta"
        } else if (n8 == 5) {
            "Quints"
        } else if (n8 == 6) {
            "Sexta"
        } else if (n8 == 7) {
            "Sabado"
        } else {
            "Data invalida"
        })
     //Exercicio 19
     // Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
     //O resultado da operação deve ser acompanhado de uma frase que diga se o número e:
     //Par ou ímpar;
     //Positivo ou negativo;
    val par= 2
    val impar= 3
    val positivo= 0
    val negativo = -1
    var parouimpar = "saber se é par ou impar"
    var positivoounegativo = "saber se é positivo ou negativo"


    when (parouimpar) {
        if (par%2 ==0){
            println("par")
        }else{
            println("impar")
        }.toString()}


    when(positivoounegativo) {
        if (positivo>=0){
            ("positivo")
        }else{
            ("negativo")}
    }

    //Exercicio 20
    //Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    //
    //“Telefonou para a vítima? “
    //“Esteve no local do crime?”
    //“Mora perto da vítima? “
    //“Devia para a vítima? “
    //“Já trabalhou com a vítima? “
    //O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    // Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
    // Caso contrário, ele será classificado como “Inocente“.

    val v1= "Sim".toInt(1)
    val v2= "Nao".toInt(0)
    val v3= "Sim".toInt(1)
    val v4= "Nao".toInt(0)
    val v5= "Sim".toInt(1)


    var total = v1+v2+v3+v4+v5


    val message = when (total) {
        2 -> "Suspeita"
        3,4 ->"Cumplice"
        5 -> "Assassino"
        else -> "Inocente"}


// Ou
}
if (total ==2){
    println("Suspeita")
} else  if (total==3 || total ==4) {
    println("Cumplice")
}else if (total ==5) {
    println("Assassino")
}else {
    "Inocente"}





    //Exercicio 22
    val a= 10
    val b= 0

     println (if (a > b){
         "a>b"
     }else {
            "a<b" })

    //Exercicio 23

    //Exercicio 25
    val raio = 10
    var diametro = 2*raio
    var comprimento = 2*3.14*raio
    //var area = 3.14*(raio) - como coloca um numero elevado a alguma coisa? (a = π r²)
    println("Diamentro:$diametro")
    println("Comprimento:$comprimento")

    //Exercicio 26
    val idadesangue = 20
    println(if (idadesangue>=18 && idadesangue<=67){
    "Pode doar sangue"
    }else{
        "Nao pode doar sangue"})

    //Exercicio 27
    val dia= 29
    val mes = 4
    val ano = 2001
    if (dia <=31 && mes<=12 && ano<=2026){
        println("$dia/$mes/$ano")
    }else {
        println("Data invalida")}

    //Exercicio 28
    val x= 2
    val y= 3
    println("Variavel x: $y")
    println("Variavel y: $x")
}




