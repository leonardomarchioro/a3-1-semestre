import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FolhaPagamento {
    private final List<FuncionarioPadrao> funcionarios;
    private final Scanner scanner;

    public FolhaPagamento(List<FuncionarioPadrao> funcionarios, Scanner scanner) {
        this.funcionarios = funcionarios;
        this.scanner = scanner;
    }

    public void gerarFolha() {
        double totalFolhaDePagamento = 0;
            System.out.println("\n--- Folha de Pagamento ---\n");
        for (FuncionarioPadrao funcionario : this.funcionarios) {
            double salario = funcionario.calcularSalario();
            totalFolhaDePagamento += salario;
            funcionario.exibirInformacoes();
            System.out.println("\n------\n");
        }
        Locale brasil = new Locale("pt", "BR");
        NumberFormat totalFolhaDePagamentoMoeda = NumberFormat.getCurrencyInstance(brasil);
        String totalFormatado = totalFolhaDePagamentoMoeda.format(totalFolhaDePagamento);

        System.out.println("Total da Folha de Pagamento: " + totalFormatado);
        System.out.println("Total de Funcionários: " + this.funcionarios.size());

        System.out.println("\nPressione ENTER para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();        
    }
}