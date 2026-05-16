import java.util.Scanner;

public class Main {
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n--- Programa de funcionários ---\n");
        System.out.println("Escolha uma das opções abaixo:\n");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair do Programa");
        System.out.println("\n\n");

        int input = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                input = scanner.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite apenas números.");
                scanner.nextLine();
            }
        }

        return input;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Empresa empresa = new Empresa(scanner);

            OUTER: while (true) {
                int input = menu(scanner);
                switch (input) {
                    case 1 -> {
                        clear();
                        empresa.criarFuncionario();
                        break;
                    }
                    case 2 -> {
                        clear();
                        empresa.criarFuncionarioComissionado();
                        break;
                    }

                    case 3 -> {
                        clear();
                        empresa.criarFuncionarioDeProducao();
                        break;
                    }

                    case 4 -> {
                        clear();
                        FolhaPagamento folhaPagamento = new FolhaPagamento(empresa.funcionarios, scanner);
                        folhaPagamento.gerarFolha();
                        break;
                    }

                    case 0 -> {
                        clear();
                        System.out.println("\n----- Adeus -----\n");
                        break OUTER;
                    }
                    default -> {
                        clear();
                        System.out.println("Comando inválido, vamos novamente");
                    }

                }
            }
        }
    }
}