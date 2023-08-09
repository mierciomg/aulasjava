package jiraya.cursojava.Introducao7ModificadorEstatico.Teste;
//aula 61, 62
import jiraya.cursojava.Introducao7ModificadorEstatico.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 240);
        Carro c3 = new Carro("Audi", 300);




        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
