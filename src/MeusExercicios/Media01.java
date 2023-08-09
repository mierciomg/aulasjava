package MeusExercicios;

public class Media01 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 5;
        nums[3] = 6;
        nums[4] = 7;
        nums[5] = 10;
//imprime os numeros
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
//tira a média dos numeros
        int media = 0;
        for (int i = 0; i < nums.length; i++)
            media += nums[i];
        float total = (float) media / nums.length;
        System.out.println("A média é: " + total);


    }

}


