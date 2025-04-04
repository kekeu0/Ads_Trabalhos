import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoGasolina = 5.50;
        double precoAlcool = 4.19;

        System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        double precoLitro;
        double desconto;

        if (tipo == 'A') {
            precoLitro = precoAlcool;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            precoLitro = precoGasolina;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        double totalSemDesconto = litros * precoLitro;
        double valorDesconto = totalSemDesconto * desconto;
        double totalAPagar = totalSemDesconto - valorDesconto;

        System.out.println("Valor total sem desconto: R$ " + totalSemDesconto);
        System.out.println("Desconto aplicado: R$ " + valorDesconto);
        System.out.println("Valor a pagar: R$ " + totalAPagar);
        scanner.close();

    }
}