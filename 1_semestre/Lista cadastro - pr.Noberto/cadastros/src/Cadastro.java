import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> listAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu");
            System.out.println("1 = Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Remover Truma");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcão: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Cadastro de Aluno: ");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("Matrícula: ");
                String matricula = scanner.nextLine();

                System.out.println("RG: ");
                String rg = scanner.nextLine();

                System.out.println("CPF: ");
                String cpf = scanner.nextLine();

                System.out.println("Endereço");
                String endereco = scanner.nextLine();

                System.out.println("ID da Turma");
                int turmaId = scanner.nextInt();
                scanner.nextLine();

                Aluno novoAluno = new Aluno(nome, matricula, rg, cpf, endereco, turmaId);
                listAlunos.add(novoAluno);

                System.out.println("Aluno cadastro com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Cadastro de Professor: ");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("Matrícula: ");
                String matricula = scanner.nextLine();

                System.out.println("RG: ");
                String rg = scanner.nextLine();

                System.out.println("CPF: ");
                String cpf = scanner.nextLine();

                System.out.println("Endereço");
                String endereco = scanner.nextLine();

                Professor novoProfessor = new Professor(nome, matricula, rg, cpf, endereco);
                listaProfessores.add(novoProfessor);

                System.out.println("Professor cadastrado com sucesso!");
            } else if (opcao == 3) {
                System.out.println("Digite o ID da truma que deseja remover: ");
                int turmaParaRemover = scanner.nextInt();
                scanner.nextLine();

                ArrayList<Aluno> novaLista = new ArrayList<>();

                for(Aluno a : listAlunos){
                    if (a.getTurmaId() != turmaParaRemover){
                        novaLista.add(a);
                    }
                }

                listAlunos = novaLista;
                System.out.println("Turma removida!");

                int novoId = 1;
                for (Aluno a : listAlunos){
                    a.setTurmaId(novoId);
                    novoId++;
                }
            } else if (opcao == 0) {
                System.out.println("Saindo");
            }
            else {
                System.out.println("Opção inválida!");
            }
            System.out.println("\n Lista de Professores");
            for (Professor p : listaProfessores) {
                System.out.println(p.toString());
            }

            System.out.println("\n Lista de Alunos");
            for (Aluno a : listAlunos){
                System.out.println(a.toString());
            }
        }
        scanner.close();
    }
}