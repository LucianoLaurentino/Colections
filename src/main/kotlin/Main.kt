fun main() {

    val superCine = Cinema("superCine", 4, 21)
    println("Bem-Vindo ao CineQi!")

    if (superCine.addNovoFilme(
            Filme(NomeFilme = "O heroi de corpo fechado", Genero = "Drama, Ação", anoLancamento = 2021)
        )
    )
        if (superCine.addNovoFilme(
                Filme(NomeFilme = "vidro", Genero = "Drama & Açâo", anoLancamento = 2021)
            )
        )
            println("Filmes disponíveis:")

    val filme = superCine.listaFilmes()
    val filmesTam = filme.size - 1
    for (index in 0..filmesTam) {
        println("\nNome: ${filme[index].NomeFilme}\nGeneros: ${filme[index].Genero}\nLançamento: ${filme[index].anoLancamento}")
    }
    println("\nQual filme você quer assistir?\n1 - Avatar:\n2 - Batman:")
    val escolhaUsuario = readLine()!!.toInt()

    if (escolhaUsuario == 1) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 1, assentosOcupados = "Não"
            )
        )
    } else if (escolhaUsuario == 2) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 1, assentosOcupados = "Sim"
            )
        )
    } else {
        println("Choice Invalid")
    }

    if (escolhaUsuario == 1) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 2, assentosOcupados = "Não"
            )
        )
    } else if (escolhaUsuario == 2) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 2, assentosOcupados = "Sim"
            )
        )
    }

    if (escolhaUsuario == 1) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 3, assentosOcupados = "Não"
            )
        )
    } else if (escolhaUsuario == 2) {
        superCine.RegistrandoAssento(
            Assento(
                numeroDoAssento = 3, assentosOcupados = "Sim"
            )
        )
    }


    println("Assentos disponíveis:")
    val seat = superCine.listarAssentos()
    val numeroDoAssento = seat.size - 1
    for (index in 0..numeroDoAssento) {
        println("\nAssentos: ${seat[index].numeroDoAssento}\nOcupados: ${seat[index].assentosOcupados}")
    }

    println("Informe seu nome: ")
    val nomeCompleto = readLine()!!.toString()

    println("\nEscolha alguma das opções: ${nomeCompleto}?\nNumero 1 para o primeiro assento\nNumero 2 para o segundo assento \nNumero 3 para o terceiro assento")

    val ocupado = readLine()!!.toInt()

    if (escolhaUsuario == 1 && ocupado == 3) {
        println("Este assento está ocupado no momento.")
    } else if (escolhaUsuario == 2 && ocupado == 2 ||
        escolhaUsuario == 2 && ocupado == 3
    ) {
        println("Este assento está ocupado no momento.")
    }

    val precoIngresso = 32
    val metade = 2
    val tax = 4.48

    println("\nComo você se identifica\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - NDA")
    val totalValue = when (readLine()!!.toInt()) {
        1 -> println("Valor final é: ${(precoIngresso / metade) + tax}")
        2 -> println("Valor final é: ${(precoIngresso / metade) + tax}")
        3 -> println("Valor final é: ${(precoIngresso / metade) + tax}")
        else -> println("Valor final é: 36,48")
    }

    println("${nomeCompleto}, Deseja finalizar a compra de um ingresso no preço de: ${totalValue}\n1 - Sim!\n2 - Não!")
    val end = readLine()!!.toInt()

    if (end == 1) {
        println("Tenha um bom filme")
    } else if (end == 2) {
        println("Até a proxima...")
    }

}