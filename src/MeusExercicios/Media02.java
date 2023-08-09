package MeusExercicios;

public class Media02 {
    public static void main(String[] args) {
        int[] numeros = new int[]{2, 5, 7, 9, 10};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            System.out.println(soma);
        }
        float media = (float) soma / numeros.length;
        System.out.println("A média calculada é "+media);
    }
}
