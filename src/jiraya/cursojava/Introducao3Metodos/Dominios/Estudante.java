package jiraya.cursojava.Introducao3Metodos.Dominios;
//aula 49, 50, 51
import jiraya.cursojava.Introducao3Metodos.Teste.ImprimeEstudante;

public class Estudante extends ImprimeEstudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
