package jiraya.cursojava.Introducao8Associacao.Teste;
//aula 65
import jiraya.cursojava.Introducao8Associacao.Dominio.Jogador;
import jiraya.cursojava.Introducao8Associacao.Dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brazil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
