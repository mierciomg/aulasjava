package jiraya.cursojava.Introducao1;

public class Aula21EstruturasCondicionaisElseIf {
    /*https://youtu.be/exxeNsgcg3c?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
    idade < 15 Categoria Infantil
    idade >= 15 && < 18 Categoria Juvenil
    idade > 18 Categoria Adulto
     */
    public static void main(String[] args) {
        int idade = 10;
        if (idade <15){
            System.out.println("Categoria Infantil");
        }else if(idade >=15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }

    }



}
