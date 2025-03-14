import javax.swing.JOptionPane;

public class DeMaior {
    public static void main(String[] args) {

        //Código usando if else

        String dirigir, dirigirT;
        int horasVida = 8766;
        double result1, result2;


        int idade = Integer.parseInt(JOptionPane.showInputDialog("(if/else) Digite sua Idade:"));
        if (idade >= 18) {
            dirigir = "Você é maior de idade, pode dirigir!";
        } else {
            dirigir = "Você é menor de idade, não pode dirigir";
        }
        JOptionPane.showMessageDialog(null, dirigir, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        result1 = idade * horasVida;

        JOptionPane.showMessageDialog(null, "Sua idade em horas é: " + result1, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        //Código usando if térnario

        int idadeT = Integer.parseInt(JOptionPane.showInputDialog("(Térnario) Digite sua Idade:"));
        dirigirT = idadeT >= 18 ? "Você é maior de idade, pode dirigir!" : "Você é menor de idade, não pode dirigir";
        JOptionPane.showMessageDialog(null,dirigirT, "Resultado" ,JOptionPane.INFORMATION_MESSAGE);

        result2 = idadeT * horasVida;

        JOptionPane.showMessageDialog(null, "E sua idade em horas é: " + result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}