package br.pucminas.iecpucminas_javavskotlin

data class EstudantePuc1(
    var uid: String,
    var primeiroNome: String,
    var segundoNome: String,
    var idade: Int
)

class EstudantePucCasoDeUso {
    fun buscarEstudantePuc(): EstudantePuc1 {
        val estudantePuc = EstudantePuc1(
            "puc001",
            "Fabricio",
            "Valadares",
            39
        )
        return estudantePuc
    }
}

fun main() {
    val estudante = EstudantePucCasoDeUso()
    println(
        "Exemplo de impressão usando o toString " +
                estudante.buscarEstudantePuc()
    )
}