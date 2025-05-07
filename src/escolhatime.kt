fun escolherTime(jogador: String): Map<String, Map<String, Any>> {
    val time = mutableMapOf<String, Map<String, Any>>()
    println("Jogador $jogador, escolha seu nickname:")
    val nome = readLine() ?: "Jogador $jogador"

    for (i in 1..6) {
        var escolhido: Map<String, Any>
        do {
            println("$nome, escolha o Pokémon $i (Digite exatamente como no cadastro):")
            val entrada = readLine()?.trim() ?: ""
            if (pokemonDisponivel.containsKey(entrada)) {
                escolhido = pokemonDisponivel[entrada]!!
                println("Pokémon $entrada adicionado ao seu time.")
                break
            } else {
                println("Pokémon inválido. Tente novamente.")
            }
        } while (true)
        time["Pokemon $i"] = escolhido
    }

    println("Time de $nome:")
    time.forEach { (chave, valor) ->
        Thread.sleep(1000)
        println("$chave: ${valor["NOME"]} | Vida: ${valor["VIDA"]} | Dano: ${valor["DANO"]}")
    }

    return time
}