import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoP, total, comissao;
        int quantidade;

        System.out.print("Digite o peço da peça: ");
        precoP = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças vendidas:");
        quantidade = scanner.nextInt();

        total = precoP * quantidade;
        comissao = total * 5/100;

        System.out.printf("O valor da comissão é: R$ %.2f%n", comissao);
        scanner.close();


    }
}