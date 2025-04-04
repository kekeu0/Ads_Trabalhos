import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;
        int contarMulher = 0;

        for (int i = 0; i < 500; i++) {
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a cor dos olhos (A/V/C): ");
            char olhos = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a cor dos cabelos (L/C/P): ");
            char cabelos = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 'F' && idade >= 18 && idade <= 35 && olhos == 'V' && cabelos == 'L') {
                contarMulher++;
            }
        }

        System.out.println("Maior idade do grupo: " + maiorIdade);
        System.out.println("Quantidade de mulheres com idade entre 18 e 35 anos, olhos verdes e cabelos louros: " + contarMulher);
        scanner.close();
    }
}