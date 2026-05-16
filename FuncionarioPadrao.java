import java.text.NumberFormat;
import java.util.Locale;

public class FuncionarioPadrao {
    public double salario;
    public int id;
    public String nome;

    public FuncionarioPadrao(int id, String nome, double  salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getSalarioBase() {
        return this.salario;
    }

    public double calcularSalario() {
        return this.salario;
    }

    public String converterParaMoeda(double valor) {
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        return formatoMoeda.format(valor);
    }

    public void exibirInformacoes() {
        System.out.println("Matricula: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário final: " + this.converterParaMoeda(this.calcularSalario()));
    }
}