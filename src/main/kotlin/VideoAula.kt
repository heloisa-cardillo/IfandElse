fun main(args: Array<String>) {

    var idade = 18

    if (idade <=10){
        println("Maior idade")
    }else{
        println("Menor de idade")
    }
    //quando tem apenas um else

    var idade2 = 10

    if (idade2<=1) {
        println("Bebe")
    } else if (idade <=10){
        println("Crianca")
    }else {
        println("Adulto")
    }
    //quando tem mais de um else, apenas o ultimo else - o resto else if

    //If como expressao
    var idade3= 21
    println(if (idade3>=18){
        "Habilitado"
    }else{
        "Nao habilitado"
    })

}




