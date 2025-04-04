import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.print("O antecessor desse número é: " + (num - 1));

    }
}