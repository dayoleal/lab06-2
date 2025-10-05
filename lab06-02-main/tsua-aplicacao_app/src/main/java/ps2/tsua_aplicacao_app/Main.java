package ps2.tsua_aplicacao_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repo repo = new Repo(); // Instância única do repositório
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1) Listar todos");
            System.out.println("2) Buscar por dados específicos");
            System.out.println("3) Criar um novo");
            System.out.println("4) Alterar os dados");
            System.out.println("5) Apagar por ID");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    repo.listarTodos();
                    break;
                case 2:
                    System.out.print("Digite o ID ou outro dado para buscar: ");
                    String busca = scanner.nextLine();
                    repo.buscar(busca);
                    break;
                case 3:
                    System.out.print("Digite os dados para criar novo registro: ");
                    String dados = scanner.nextLine();
                    repo.criar(dados);
                    break;
                case 4:
                    System.out.print("Digite o ID do registro para alterar: ");
                    String idAlterar = scanner.nextLine();
                    System.out.print("Digite os novos dados: ");
                    String novosDados = scanner.nextLine();
                    repo.alterar(idAlterar, novosDados);
                    break;
                case 5:
                    System.out.print("Digite o ID do registro para apagar: ");
                    String idApagar = scanner.nextLine();
                    repo.apagar(idApagar);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
