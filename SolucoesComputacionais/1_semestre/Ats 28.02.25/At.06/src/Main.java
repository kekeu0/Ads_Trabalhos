import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Você tem %d dias de vida", idade * 365);

    }
}