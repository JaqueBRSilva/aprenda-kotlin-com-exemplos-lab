import java.time.LocalDateTime

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(
    val nome: String,
    val email: String,
    var dataMatricula: LocalDateTime? = LocalDateTime.now(),
    var formacaoMatriculada: ConteudoEducacional? = null,
    val matricula: String,
)

data class ConteudoEducacional(var nome: String, val duracao: Int, var nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun fazerMatricula(usuario: Usuario) {
        // TODO: Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} cadastrado em $nome")
    }
}

fun main() {
    // TODO: Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
    // TODO: Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.

    val react = ConteudoEducacional("React", 45, Nivel.BASICO)
    val kotlin = ConteudoEducacional("Kotlin", 60, Nivel.INTERMEDIARIO)
    val java = ConteudoEducacional("Java", 120, Nivel.AVANCADO)

    val user1 = Usuario("Ana", "ana@email.com", formacaoMatriculada = react, matricula = "1A")
    val user2 = Usuario("Beatriz", "beatriz@email.com", formacaoMatriculada = kotlin, matricula = "2B")
    val user3 = Usuario("Carla", "carla@email.com", formacaoMatriculada = java, matricula = "3C")

    println("ALUNO(A): ${user1.nome} | Data/Horário: ${user1.dataMatricula} | Formação selecionada: ${user1.formacaoMatriculada}")
    println("ALUNO(A): ${user2.nome} | Data/Horário: ${user2.dataMatricula} | Formação selecionada: ${user2.formacaoMatriculada}")
    println("ALUNO(A): ${user3.nome} | Data/Horário: ${user3.dataMatricula} | Formação selecionada: ${user3.formacaoMatriculada}")
}
