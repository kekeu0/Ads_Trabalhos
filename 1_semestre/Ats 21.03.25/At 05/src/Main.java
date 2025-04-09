import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int num = scanner.nextInt();

        int contador = 0;
        int pares = 0;

        while (contador < num) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
            contador++;
        }

        System.out.print("A quantidade de números pares é: "+ pares);
        scanner.close();
    }
}