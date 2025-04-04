import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double ir;

        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + ir);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        scanner.close();
    }
}