fun batalhar(time1: Map<String, Map<String, Any>>, time2: Map<String, Map<String, Any>>) {
    var vitoriasJogador1 = 0
    var vitoriasJogador2 = 0

    for (i in 1..6) {
        val p1 = time1["Pokemon $i"]!!
        val p2 = time2["Pokemon $i"]!!

        var vida1 = p1["VIDA"] as Int
        val dano1 = p1["DANO"] as Int
        var vida2 = p2["VIDA"] as Int
        val dano2 = p2["DANO"] as Int

        val nome1 = p1["NOME"]
        val nome2 = p2["NOME"]

        println("\n Batalha $i: $nome1 VS $nome2")
        Thread.sleep(1000)


        while (vida1 > 0 && vida2 > 0) {
            println("Turno:")
            Thread.sleep(1000)

            vida2 -= dano1
            println("➡ $nome1 ataca e causa $dano1 de dano em $nome2! Vida restante de $nome2: ${vida2.coerceAtLeast(0)}")
            Thread.sleep(2000)


            if (vida2 <= 0) {
                println(" $nome2 foi derrotado!\n")
                Thread.sleep(2000)
                vitoriasJogador1++
                break
            }

            vida1 -= dano2
            println("⬅ $nome2 ataca e causa $dano2 de dano em $nome1! Vida restante de $nome1: ${vida1.coerceAtLeast(0)}")
            Thread.sleep(2000)

            if (vida1 <= 0) {
                println(" $nome1 foi derrotado!\n")
                Thread.sleep(2000)
                vitoriasJogador2++
                break
            }

        }
    }

    println("\n Resultado final:")
    Thread.sleep(1000)
    println("Jogador 1 venceu $vitoriasJogador1 batalhas.")
    Thread.sleep(1000)
    println("Jogador 2 venceu $vitoriasJogador2 batalhas.")
    Thread.sleep(1000)

    when {
        vitoriasJogador1 > vitoriasJogador2 -> println(" Jogador 1 venceu a partida!")
        vitoriasJogador2 > vitoriasJogador1 -> println(" Jogador 2 venceu a partida!")
        else -> println(" A partida terminou empatada!")
    }
}