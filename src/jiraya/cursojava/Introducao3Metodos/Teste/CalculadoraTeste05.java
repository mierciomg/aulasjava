package jiraya.cursojava.Introducao3Metodos.Teste;

import jiraya.cursojava.Introducao3Metodos.Dominios.Calculadora;

//aula 52
public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
    }
}
