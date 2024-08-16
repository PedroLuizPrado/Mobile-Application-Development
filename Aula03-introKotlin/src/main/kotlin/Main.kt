package org.example

fun mostrarMsg(nome:String,sobreNome:String, cpf:Int){
    println("Olá..$nome $sobreNome, seu cpf é $cpf")
}

fun calcIdade(anoNasc:Int) : Int {
    var idade = 2024 - anoNasc
    return idade

}


fun main() {
   mostrarMsg("Fernando" , "Abreu",152458963)
    println(calcIdade(2004))

}