import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        int contador = 0;
        double soma = 0;

        double media = 0;
        while (contador < n) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            soma += numero;
            contador++;

            media = soma / n;
        }
        System.out.print("A média dos números é: " + media);
        scanner.close();
    }
}