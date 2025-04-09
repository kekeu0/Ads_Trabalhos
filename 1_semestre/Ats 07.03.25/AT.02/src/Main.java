import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();

        double menorPreco = preco1;

        if (preco2 < menorPreco) {
            menorPreco = preco2;
        }

        if (preco3 < menorPreco) {
            menorPreco = preco3;
        }

        System.out.println("Você deve comprar o produto que custa: R$ " + menorPreco);
        scanner.close();
    }
}