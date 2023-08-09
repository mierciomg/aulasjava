package jiraya.cursojava.Introducao1;

public class Aula29EstruturasDeRepeticaoExercicioBreak {
    /*https://youtu.be/bcv-cgpw7Ak?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
    imprima os primeiros 35 numeros de um dado valor
     */

    public static void main(String[] args) {
        int valorMaximo = 35;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 35) {
                break;
            }
            System.out.println(i);
        }

    }
}
