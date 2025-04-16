import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cadastros = new String[100];
        int contador = 0, opcao = 0;

        while (opcao !=6){
            System.out.println("Menu");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar Todos");
            System.out.println("5 - Listar Item");
            System.out.println("6 - Sair");

            opcao = scanner.nextInt();

            if(opcao == 1){
                    System.out.print("Digite o nome que deseja Incluir: ");
                    cadastros[contador] = scanner.nextLine();
                    contador++;
                    System.out.println("Nome adicionado");
            } else if (opcao == 2){
                    System.out.print("Digite o índice que deseja alterar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < contador){
                        System.out.print("Digite o novo nome: ");
                        cadastros[indice] = scanner.nextLine();
                        System.out.println("Nome alterado");
                    }else {
                        System.out.println("Erro!");
                    }
            }else if (opcao == 3) {
                    System.out.println("Digite o índice do cadrastro que deseja excluir: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < contador) {
                        for (int i =indice; i < contador - 1; i++){
                            cadastros[i] = cadastros[i + 1];
                        }
                    cadastros[contador - 1] = null;
                     contador--;
                     System.out.println("Cadastro excluido");
                    } else {
                        System.out.println("Índice inválido!");
                    }
            }else if (opcao == 4){
                System.out.println("Listando todos os cadastros");
                for (int i = 0; i < contador; i++){
                    System.out.println(i +":"+ cadastros[i]);
                }

            }else if (opcao == 5){
                System.out.println("Digite o indice que deseja ver: ");
                int indice = scanner.nextInt();
                if (indice >=0 && indice < contador){
                    System.out.println("Nome cadastrado no índice" + indice + cadastros[indice]);
                }else {
                    System.out.println("Índice inválido");
                }
            } else if (opcao == 6) {
                System.out.println("Saindo do Sistema");
            }else {
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}