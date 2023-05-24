fun main() {
    //Exercicio1
    var numero = 1
//    val numero2= 10
//    var resultado = numero*numero2

    while (numero <= 10) {
        println("$numero*1")
        numero++
    }

    for (n in 0..10) {
        println("${n}*${n + 1}")
    }

    //Exercicio2

    var n1 = 1
    var n = 1
//        val n2=2
//        val n3=3
//        val n4=4
//        val n5=5
//        val n6=6
//        val n7=7
//        val n8=8
//        val n9=9
//        val n10=10

    while (n in 0..10) {
        n++
        println("$n1*$n")
    }
//
//    var multiplicar = n * n1
//    var somar = n1 + 1
//
//    var numero3 = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
//    var numero4 = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

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
}

