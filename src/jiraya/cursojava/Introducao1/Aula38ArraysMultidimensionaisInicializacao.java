package jiraya.cursojava.Introducao1;

public class Aula38ArraysMultidimensionaisInicializacao {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];
        for(int[] arrayBase: arrayInt){
            System.out.println("--------");
            for (int num: arrayBase){
                System.out.print(num + "--");
            }
        }
    }

}
