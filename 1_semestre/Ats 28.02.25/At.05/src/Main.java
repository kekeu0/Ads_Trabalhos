import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando a área de um rêtangulo");

        System.out.print("Digite a base do: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.print("A área do retângulo é: " + area);
        scanner.close();

    }
}