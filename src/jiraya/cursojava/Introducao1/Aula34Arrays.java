package jiraya.cursojava.Introducao1;

public class Aula34Arrays {
    //https://youtu.be/Vsn-CXzzpUc?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Miércio";
        nomes[1] = "Gisele";
        nomes[2] = "Caleb";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }

}
