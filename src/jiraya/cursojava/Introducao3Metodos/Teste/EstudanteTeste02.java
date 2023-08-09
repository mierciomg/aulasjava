package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Miércio";
        estudante.idade = 48;
        estudante.sexo = 'M';
        estudante1.nome = "Gisele";
        estudante1.idade = 38;
        estudante1.sexo = 'F';

        estudante.imprime();
        estudante1.imprime();



    }
}
