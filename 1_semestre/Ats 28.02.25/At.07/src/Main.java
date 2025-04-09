import java.util.Scanner
;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int anos = scanner.nextInt();

        System.out.print("Digite os meses adicionais: ");
        int meses = scanner.nextInt();

        System.out.print("Digite os dias adicionais: ");
        int dias = scanner.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Sua idade em dias é: %d dias", idadeEmDias);
        scanner.close();

    }
}