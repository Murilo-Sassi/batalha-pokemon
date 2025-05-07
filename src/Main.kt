fun main() {
    println("--- LISTA DE POKÉMONS DISPONÍVEIS ---")

    for ((key, dados) in pokemonDisponivel) {
        val nome = dados["NOME"]
        val vida = dados["VIDA"]
        val dano = dados["DANO"]
        println("$nome -> Vida: $vida, Dano: $dano")
    }
    val time1 = escolherTime("1")
    val time2 = escolherTime("2")
    batalhar(time1, time2)
}