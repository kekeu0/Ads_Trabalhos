import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: ");
        double salario = scanner.nextDouble();
        double percentualReajuste;

        if (salario <= 280) {
            percentualReajuste = 20;
        } else if (salario <= 700) {
            percentualReajuste = 15;
        } else if (salario <= 1500) {
            percentualReajuste = 10;
        } else {
            percentualReajuste = 5;
        }

        double aumento = (salario * percentualReajuste) / 100;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualReajuste + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o reajuste: R$ " + novoSalario);
        scanner.close();;
    }
}