import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double acum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a nota: ");
            acum += read.nextDouble();
        }
        double media = acum / 4;
        if (media >= 6) {
            System.out.println("Sua media e: " + media + "Parabens voce foi aprovado");
        } else {
            System.out.println("Sua media e " + media + " e, parece que alguem vai pra recuperação");
        }
    }
}
