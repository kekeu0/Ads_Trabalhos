import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR DE DÓLAR PARA REAL");

        double n1;
        double dolar = 5.70;

        System.out.print("Digite a quiantidadde de dólares: ");
        n1 = scanner.nextDouble();

        double rlt = n1 * dolar;
        System.out.printf("O valor em reais é: R$ %.2f%n", rlt);
        scanner.close();
    }
}