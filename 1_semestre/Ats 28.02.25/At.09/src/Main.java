import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double reajuste = scanner.nextDouble();

        double novoSalario = salario + (salario * reajuste / 100);

        System.out.printf("O novo salário é: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}