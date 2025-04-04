import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = 0;

        for(int i = 1;i <= 5;i++) {
            System.out.print("Digite o " + i + " número: ");
            int num = scanner.nextInt();
            result += num;
        }
        System.out.println("A soma é: " + result );
    }
}