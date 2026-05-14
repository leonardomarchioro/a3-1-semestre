import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<FuncionarioPadrao> funcionarios = new ArrayList<>();

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n\nPrograma de funcionários\n\n");
        System.out.println("Escolha uma das opções abaixo:\n");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair do Programa");
        System.out.println("\n\n");

        int input = scanner.nextInt();
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OUTER: while (true) {
            int input = menu(scanner);
            switch (input) {
                case 1 -> {
                    clear();
                    System.out.println("Cadastro funcionário padrão");
                    criarFuncionario(scanner);
                    break;
                }
                case 2 -> {
                    clear();
                    System.out.println("Cadastro funcionário Comissionado");
                    criarFuncionarioComissionado(scanner);
                    break;
                }

                case 3 -> {
                    clear();
                    System.out.println("Cadastro funcionário Produção");
                    criarFuncionarioDeProducao(scanner);
                    break;
                }

                case 4 -> {
                    clear();
                    System.out.println("Gerar Folha de Pagamento");
                    break;
                }

                case 0 -> {
                    clear();
                    System.out.println("\n\nAdeus\n\n");
                    break OUTER;
                }
                default -> {
                    clear();
                    System.out.println("Comando inválido, vamos novamente");
                }

            }
        }
        scanner.close();
    }

    public static void criarFuncionario(Scanner scanner) {
        System.out.println("\nId do funcionário: ");
        String id = scanner.next();

        System.out.println("\nNome do funcionário: ");
        String nome = scanner.next().trim();

        String nomeFormatado = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        FuncionarioPadrao funcionario = new FuncionarioPadrao(nomeFormatado, id);
        funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }

    public static void criarFuncionarioComissionado(Scanner scanner) {
        System.out.println("\nId do funcionário: ");
        String id = scanner.next();

        System.out.println("\nNome do funcionário: ");
        String nome = scanner.next().trim();

        String nomeFormatado = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        System.out.println("\nTotal de vendas: ");
        double totalVendas = scanner.nextDouble();

        System.out.println("\nPorcentagem de comissão: ");
        double porcentagem = scanner.nextDouble();

        FuncionarioComissionado funcionario = new FuncionarioComissionado(nomeFormatado, id, totalVendas, porcentagem);
        funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }

    public static void criarFuncionarioDeProducao(Scanner scanner) {
        System.out.println("\nId do funcionário: ");
        String id = scanner.next();

        System.out.println("\nNome do funcionário: ");
        String nome = scanner.next().trim();

        String nomeFormatado = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        System.out.println("\nTotal de peças: ");
        int totalPecas = scanner.nextInt();

        System.out.println("\nValor por Peça: ");
        double valorPecas = scanner.nextDouble();

        FuncionarioDeProducao funcionario = new FuncionarioDeProducao(nomeFormatado, id, totalPecas, valorPecas);
        funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }
}