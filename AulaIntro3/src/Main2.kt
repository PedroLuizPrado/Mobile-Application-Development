fun main () {
    //list0f -> imutável, tamanho fixo, e não pode ser alterado

    //não da pra mudar
    var estadoBr = listOf("RS","SC","PR")



    //arrayListOf -> mutável,tamanho n fixo, e pode ser alterado
    var nomesAlunos = arrayListOf("Larissa","Luna", "Deyckson")
    nomesAlunos.add("Lucas")
    println(nomesAlunos)
    nomesAlunos[1] = ("Pedro")
    nomesAlunos.remove("Luna")

    println(nomesAlunos.size)


    //set -> não fica em ordem, não permite duplicados

    var idadeAlunos = hashSetOf(10,15,22,30,30,55,58)
    println(idadeAlunos)


    // map -> estrutura de chave/ valor

    var mapa = hashMapOf(
        "Leão" to "Rei da selva", "Cachorro" to
                "Melhor amigo do homem",
        "Gato" to "Arranha"
    )
        mapa.put("Panda", "Só hiberna")
        mapa.remove("Gato")

    for (item in mapa){
        println(item.value)
    }


}