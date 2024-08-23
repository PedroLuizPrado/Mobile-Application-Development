
enum class StatusPedido{
    APROVADO,REPROVADO,PENDENTE
}

class Pedido{
   var status: StatusPedido = StatusPedido.APROVADO

}


fun main() {


    //Enum -> é um tipo de dados que consiste em um conjunto
    // de constantes

    val pedido01 = Pedido()
    println(pedido01.status)
}