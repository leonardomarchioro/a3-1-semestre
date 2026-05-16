import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    public List<FuncionarioPadrao> funcionarios;
    private int ultimoId;
    private final int salarioBase;
    private final Scanner scanner;

    public Empresa(Scanner scanner) {
        this.funcionarios = new ArrayList<>();
        this.ultimoId = 0;
        this.salarioBase = 2000;
        this.scanner = scanner;
    }

    private int gerarId() {
        int id = this.ultimoId + 1;
        this.ultimoId = id;
        return id;
    }

    private String formatarTexto(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    private String inputTexto() {
        String input = "";
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                input = scanner.next();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        }
        return input;
    }

    private int inputInt() {
        int input = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                input = scanner.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        }
        return input;
    }

    private double inputDouble() {
        double input = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                input = scanner.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public void criarFuncionario() {
        System.out.println("Cadastro funcionário padrão");

        int id = this.gerarId();

        System.out.println("\nNome do funcionário: ");
        String nome = this.inputTexto();
        String nomeFormatado = this.formatarTexto(nome);

        FuncionarioPadrao funcionario = new FuncionarioPadrao(id, nomeFormatado, this.salarioBase);
        this.funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }

    public void criarFuncionarioComissionado() {
        System.out.println("Cadastro funcionário Comissionado");

        int id = this.gerarId();

        System.out.println("\nNome do funcionário: ");
        String nome = this.inputTexto();
        String nomeFormatado = this.formatarTexto(nome);

        System.out.println("\nTotal de vendas: ");
        double totalVendas = this.inputDouble();

        System.out.println("\nPorcentagem de comissão: ");
        double porcentagem = this.inputDouble();

        FuncionarioComissionado funcionario = new FuncionarioComissionado(id, nomeFormatado, this.salarioBase,
                totalVendas,
                porcentagem);
        this.funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }

    public void criarFuncionarioDeProducao() {
        System.out.println("Cadastro funcionário Produção");

        int id = this.gerarId();

        System.out.println("\nNome do funcionário: ");
        String nome = this.inputTexto();
        String nomeFormatado = this.formatarTexto(nome);

        System.out.println("\nTotal de peças: ");
        int totalPecas = this.inputInt();

        System.out.println("\nValor por Peça: ");
        double valorPecas = this.inputDouble();

        FuncionarioDeProducao funcionario = new FuncionarioDeProducao(id, nomeFormatado, this.salarioBase, totalPecas,
                valorPecas);
        this.funcionarios.add(funcionario);

        System.out.println("\nFuncionário criado com sucesso");
        funcionario.exibirInformacoes();
    }
}
