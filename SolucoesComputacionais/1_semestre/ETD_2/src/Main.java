import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_GASOLINA = 5.50;
        final double PRECO_ALCOOL = 4.19;

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        double precoPorLitro;
        double desconto;

        if (tipoCombustivel == 'A') {
            precoPorLitro = PRECO_ALCOOL;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipoCombustivel == 'G') {
            precoPorLitro = PRECO_GASOLINA;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        double precoTotal = litros * precoPorLitro;
        double valorDesconto = precoTotal * desconto;
        double precoFinal = precoTotal - valorDesconto;

        System.out.printf("Valor a ser pago: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
