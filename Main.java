import java.util.Scanner;

public class Main {

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String menu(Scanner scanner) {
        System.out.println("\n\nPrograma de funcionários\n\n");
        System.out.println("Escolha uma das opções abaixo:\n");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair do Programa");
        System.out.println("\n\n");

        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OUTER: while (true) {
            String input = menu(scanner);
            switch (input) {
                case "1" -> {
                    clear();
                    System.out.println("Cadastro funcionário padrão");
                }
                case "2" -> {
                    clear();
                    System.out.println("Cadastro funcionário Comissionado");
                }

                case "3" -> {
                    clear();
                    System.out.println("Cadastro funcionário Produção");
                }

                case "4" -> {
                    clear();
                    System.out.println("Gerar Folha de Pagamento");
                }

                case "0" -> {
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
    }
}