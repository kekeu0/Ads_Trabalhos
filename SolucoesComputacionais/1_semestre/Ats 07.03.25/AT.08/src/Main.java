import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respostasPositivas = 0;

        System.out.print("Telefonou para a vítima? (S/N): ");
        if (scanner.next().equalsIgnoreCase("S")) respostasPositivas++;

        System.out.print("Esteve no local do crime? (S/N): ");
        if (scanner.next().equalsIgnoreCase("S")) respostasPositivas++;

        System.out.print("Mora perto da vítima? (S/N): ");
        if (scanner.next().equalsIgnoreCase("S")) respostasPositivas++;

        System.out.print("Devia para a vítima? (S/N): ");
        if (scanner.next().equalsIgnoreCase("S")) respostasPositivas++;

        System.out.print("Já trabalhou com a vítima? (S/N): ");
        if (scanner.next().equalsIgnoreCase("S")) respostasPositivas++;

        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}