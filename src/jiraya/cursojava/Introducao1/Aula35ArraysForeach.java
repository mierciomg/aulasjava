package jiraya.cursojava.Introducao1;

public class Aula35ArraysForeach {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 4;
        numeros[2] = 8;
        numeros[3] = 4;
        numeros[4] = 9;
        for (int num : numeros){
            System.out.println(num);
        }


    }
}
