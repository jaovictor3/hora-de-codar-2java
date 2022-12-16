import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        int acum = 0;
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("informe um numero");
            acum += read.nextInt();
        }

        System.out.println("A media aritimetica é " + acum / 10);
    }
}
