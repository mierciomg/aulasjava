package jiraya.cursojava.Introducao2Classes.Testes;
//aula 42, exercicios
import jiraya.cursojava.Introducao2Classes.Dominios.Aula42Carros;

public class Aula42CarrosTeste01 {
    public static void main(String[] args) {
        Aula42Carros carros = new Aula42Carros();
        Aula42Carros carros1 = new Aula42Carros();
        carros.nome = "Fusca";
        carros.modelo = "Volksvagen";
        carros.ano = 1945;

        carros1.nome = "KA";
        carros1.modelo = "Ford";
        carros1.ano = 2015;

//aula43        carros = carros1;

        System.out.println(carros.nome);
        System.out.println(carros.modelo);
        System.out.println(carros.ano);


        System.out.println(carros1.nome);
        System.out.println(carros1.modelo);
        System.out.println(carros1.ano);
    }
}
