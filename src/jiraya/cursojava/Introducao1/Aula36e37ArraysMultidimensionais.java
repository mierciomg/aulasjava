package jiraya.cursojava.Introducao1;

public class Aula36e37ArraysMultidimensionais {
    public static void main(String[] args) {
        //arrays meses e arrays dias, sendo um lincado ao outro

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias [1][0] = 41;
        dias [1][1] = 44;
        dias [1][2] = 351;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

                
            }
            
        }
        //outra maneira de fazer
        System.out.println("------------------------");
        for (int[] arrBase:dias){
            for (int num: arrBase) {
                System.out.println(num);
                
            }
        }

    }
}
