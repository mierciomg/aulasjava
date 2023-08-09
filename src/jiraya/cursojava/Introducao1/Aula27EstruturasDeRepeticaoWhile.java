package jiraya.cursojava.Introducao1;

public class Aula27EstruturasDeRepeticaoWhile {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while (count < 10){
            System.out.println(count);// ou (++count)
            count += 1;// ou count++
        }
        do {
            System.out.println("dentro do do-while");// ou (++count)
        }while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " +i);
            
        }
    }
}
