import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("informe 3 numeros");
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        System.out.println("o maior numero é " + Math.max(a, Math.max(b,c)));
    }
}
