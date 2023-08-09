package jiraya.cursojava.Introducao2Classes.Testes;

import jiraya.cursojava.Introducao2Classes.Dominios.Aula39Estudante;
//https://www.youtube.com/watch?v=EyuPFLuvD7Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=40&pp=iAQB
//aulas 39, 40, 41
public class Aula39EstudanteTeste01 {
    public static void main(String[] args) {
        Aula39Estudante estudante = new Aula39Estudante();
        estudante.nome = "Miércio";
        estudante.idade = 49;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
