import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        int maior;

        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}