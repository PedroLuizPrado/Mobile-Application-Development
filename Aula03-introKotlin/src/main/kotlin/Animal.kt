package org.example


open class Animal() {
    //Propriedades

    var cor: String = ""
    var idade: Int = 0
    var peso:Double = 0.00

    open fun dormir(){
        println("Dormindo...")
    }


}

//Métodos


class Cao : Animal(){


    override fun dormir(){
        super.dormir()
    }
    fun latir(){
        println("latindo...")
    }

}
fun main(){
    var cao1 = Cao()
    cao1.cor = "Caramelo"
    cao1.peso = 3.400
    cao1.idade = 3

}