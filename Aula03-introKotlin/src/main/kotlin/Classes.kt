package org.example

class Casa {
    //Propriedades/Atributos

    var cor:String
    var vagasGaragem:Int


    constructor(cor:String ,vagasGaragem:Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }




    //Métodos
    fun detalhesCasa(){
        println("COR:${cor} - Vagas ${vagasGaragem}")
    }


}

fun main(){

    var casaDoPresidente = Casa( "Amarela", 5)
    casaDoPresidente.detalhesCasa()





}