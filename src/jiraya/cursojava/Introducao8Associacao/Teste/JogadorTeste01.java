package jiraya.cursojava.Introducao8Associacao.Teste;
//64,
import jiraya.cursojava.Introducao8Associacao.Dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("romario");
        Jogador jogador3 = new Jogador("cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
            
        }

    }
}
