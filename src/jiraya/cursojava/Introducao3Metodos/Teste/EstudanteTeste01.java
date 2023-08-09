package jiraya.cursojava.Introducao3Metodos.Teste;
//aula 49, 50, 51
import jiraya.cursojava.Introducao3Metodos.Dominios.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImprimeEstudante impressora = new Estudante();

        estudante.nome = "Miércio";
        estudante.idade = 48;
        estudante.sexo = 'M';
        estudante1.nome = "Gisele";
        estudante1.idade = 38;
        estudante1.sexo = 'F';

        impressora.imprime(estudante);
        impressora.imprime(estudante1);


    }
}
