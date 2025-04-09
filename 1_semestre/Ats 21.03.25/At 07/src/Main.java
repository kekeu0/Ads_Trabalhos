import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int num = scanner.nextInt();

        int contador = 0;
        int menor = Integer.MAX_VALUE;
        int maior = 0;
        int soma = 0;

        while (contador < num) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        scanner.close();
    }
}
