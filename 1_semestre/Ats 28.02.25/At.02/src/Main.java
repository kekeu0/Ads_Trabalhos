import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        for(int i = 1;i <=  4;i++){
            System.out.print("Digite o " + i + " número: ");
            int num = scanner.nextInt();
            result += Math.pow(num, 2);
        }
        System.out.println("A soma dos quadrados é: " + result );
    }
}