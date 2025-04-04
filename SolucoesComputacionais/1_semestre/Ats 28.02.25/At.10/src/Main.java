import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo da fábricação do carro: ");
        double custoF = scanner.nextDouble();

        double distribuidor = 0.28;
        double rouboEstatal = 0.45;

        double valorDistribuidor = custoF * distribuidor;
        double valorImpostos = custoF * rouboEstatal;

        double custoFinal = custoF + valorDistribuidor + valorImpostos;

        System.out.printf("O custo final é: R$ %.2f%n", custoFinal);
        scanner.close();
    }
}