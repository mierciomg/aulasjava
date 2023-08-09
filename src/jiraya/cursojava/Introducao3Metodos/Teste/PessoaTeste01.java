package jiraya.cursojava.Introducao3Metodos.Teste;
//aula 54,
import jiraya.cursojava.Introducao3Metodos.Dominios.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Miércio");
        pessoa.setIdade(48);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
