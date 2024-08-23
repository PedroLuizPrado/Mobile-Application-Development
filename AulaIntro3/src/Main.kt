//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Professor{

    fun passarConcurso()


}


open class Cidadao{
    fun direitoDeveres(){
        println("Todo cidadao tem direito e deveres")
    }

}

class ProfFernando: Cidadao(), Professor{
    override fun passarConcurso() {
        println("Foi aprovado em concurso em SP")
    }

}

class ProfGuilherme: Cidadao(),Professor{
    override fun passarConcurso() {
        println("Foi aprovado em concurso mp RN")

    }

}

fun main() {
    //Interface, um contrato que quando assumido, deverá ser
// implementado

    var guilherme = ProfGuilherme()
    guilherme.direitoDeveres()
    guilherme.passarConcurso()

}


