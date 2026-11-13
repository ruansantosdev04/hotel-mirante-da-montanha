package Hotel

import CadastroHospedes
import Eventos
import ReservaQuartos
import ArCondicionado
import AbastecimentoDeAutomoveis
import Relatorio

val nomeHotel = "Mirante da montanha"
var nomeDoUsuario: String = ""

fun main() {
    // Função principal que chama a função inicio().
    inicio()
}

fun inicio() {
    print("Bem vindo ao $nomeHotel!\n")
    println("Digite seu nome de usuário: ")
    nomeDoUsuario = readln()
    println("Digite a senha: ")
    var senha = readln().toInt()
    var tentativa = 4
    while(senha!=2678) {
        tentativa = tentativa-1
        println("Senha incorreta! Você tem mais $tentativa tentativas.")
        senha = readln().toInt()
        if(tentativa==1) {
            System.exit(0)
        }
    }
    inicio2()
}

fun inicio2() {
    println("Bem-vindo ao Hotel $nomeHotel, $nomeDoUsuario. É um imenso prazer ter você por aqui!")
    println("Escolha uma opção:")
    println("        1 -> Reserva de quartos\n" +
            "        2 -> Cadastro de hospedes\n" +
            "        3 -> Eventos\n" +
            "        4 -> Ar condicionado\n" +
            "        5 -> Abastecimento de automoveis\n" +
            "        6 -> Relatorios operacionais\n" +
            "        7 -> Indisponível\n" +
            "        8 -> Sair do hotel")
    // A varival escolha armazena a opção escolhida pelo usuário.
    // uma variavel local é utilizada apenas dentro da função inicio().
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> ReservaQuartos()
        2 -> CadastroHospedes()
        3 -> Eventos()
        4 -> ArCondicionado()
        5 -> AbastecimentoDeAutomoveis()
        6 -> Relatorio()
        7 -> sairDoHotel()
        else -> erro()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 7.")
    inicio()
}

fun sairDoHotel() {
    println("Você deseja sair?")
    val confirma = readln().toBoolean()
    if (confirma) {
        println("Até logo!")
    } else {
        inicio()
    }
}