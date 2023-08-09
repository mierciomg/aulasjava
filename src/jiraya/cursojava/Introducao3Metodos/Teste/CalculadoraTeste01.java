package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("------------");

        calculadora.subtraiDoisNumeros();
    }
}
