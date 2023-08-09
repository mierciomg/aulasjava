package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Funcionarios;

//aula 53, 57
public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        funcionario.setNome("Miércio");
        funcionario.setIdade(48);
        funcionario.setSalarios(new double[]{1200, 985, 2352});

        funcionario.imprime();
        System.out.println("_______________");
        funcionario.imprimeMediaSalarial();
        System.out.println("Média é "+ funcionario.getMedia());
    }
}
