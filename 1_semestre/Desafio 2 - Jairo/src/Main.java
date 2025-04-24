import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        int opcao = 0;

        while (opcao != 6) {
            String menu = """
                        Menu
                    1. Incluir
                    2. Alterar
                    3. Excluir
                    4. Listar Todos
                    5. Listar Item
                    6. Sair
                    """;

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                String nome = JOptionPane.showInputDialog("Digite o nome que deseja Incluir: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                lista.add(new Pessoa(nome, idade));
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");

            } else if (opcao == 2) {
                int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice para alterar:"));
                if (indice >= 0 && indice < lista.size()) {
                    String nome = JOptionPane.showInputDialog("Nome atual: " + lista.get(indice).getNome() + "\nDigite o novo nome:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade atual: " + lista.get(indice).getIdade() + "\nDigite a nova idade:"));
                    lista.get(indice).alterar(nome, idade);
                    JOptionPane.showMessageDialog(null, "Pessoa alterada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido!");
                }

            } else if (opcao == 3) {
                int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice para excluir:"));
                if (indice >= 0 && indice < lista.size()) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir " + lista.get(indice).getNome() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        lista.remove(indice);
                        JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Exclusão cancelada!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido!");
                }

            } else if (opcao == 4) {
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada!");
                } else {
                    StringBuilder listaTexto = new StringBuilder();
                    for (int i = 0; i < lista.size(); i++) {
                        listaTexto.append(i).append(": ").append(lista.get(i).exibir()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, listaTexto);
                }

            } else if (opcao == 5) {
                int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice do item:"));
                if (indice >= 0 && indice < lista.size()) {
                    JOptionPane.showMessageDialog(null, lista.get(indice).exibir());
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido!");
                }

            } else if (opcao == 6) {
                JOptionPane.showMessageDialog(null, "Saindo do sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void alterar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String exibir() {
        return "Nome: " + nome + "Idade: " + idade;
    }
}
