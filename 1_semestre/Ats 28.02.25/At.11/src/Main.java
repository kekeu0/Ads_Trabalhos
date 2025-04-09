import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVen = scanner.nextInt();

        System.out.print("Digite o valor recebido por cada carro vendido: ");
        double valorCarro = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotal = scanner.nextDouble();

        double comissaoPorCarro = carrosVen * valorCarro;
        double comissaoPorVendas = valorTotal * 0.05;

        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);
        scanner.close();
    }
}