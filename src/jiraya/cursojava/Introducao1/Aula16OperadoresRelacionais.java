package jiraya.cursojava.Introducao1;

public class Aula16OperadoresRelacionais {
    /* resto é indicado por %
    essa função pode ser usada para indentifica se um numero é par ou impar
    https://youtu.be/U390IaCtOUk?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
     */
    public static void main(String[] args) {
        int resto1 = 20 % 2;
        int resto2 = 20 % 3;

        System.out.println(resto1);
        System.out.println(resto2);

        /* < (menor) > (maior) <= (menorigual) >= (maiorigual)
         == (igual de comparação) != (diferente de comparação)
        */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDeferentelDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDeferentelDez);

    }
}
