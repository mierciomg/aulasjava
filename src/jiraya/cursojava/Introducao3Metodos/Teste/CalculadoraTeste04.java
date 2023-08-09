package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Calculadora;

//aula 48
public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;
        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println(numero1);
        System.out.println(numero2);

    }
}
