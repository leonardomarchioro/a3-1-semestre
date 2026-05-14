
public class FuncionarioPadrao {
    public double salario;
    public String Id;
    public String nome;

    public FuncionarioPadrao(String nome, String id) {
        this.salario = 2000;
        this.nome = nome;
        this.Id = id;
    }

    public double calcularSalario() {
        return this.salario;
    }

    public String getId() {
        return this.Id;
    }

    public String getNome() {
        return this.nome;
    }

    public void exibirInformacoes() {
        System.out.println("\nFuncionário Padrão\n");
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("\n");
    }
}