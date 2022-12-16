import java.util.Scanner;
public class Ex1 {
    public static void main (String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int number = numeros.nextInt();

        if(number > 0){
            System.out.println("O numero é positivo");
        }
        else if(number < 0){
            System.out.println("O numero é negativo");
        }
        else{
            System.out.println("O numero é igual a zero");
        }
    }
}