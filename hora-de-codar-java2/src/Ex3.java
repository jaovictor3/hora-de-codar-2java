import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a,b,c = 0;
        System.out.println("Informe 3 numeros");
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        int valormin = Math.min(a,Math.min(b,c));
        int valorfinal = (a+b+c) - valormin;
        System.out.println("A soma dos 2 maiores é: " + valorfinal);
    }
}
