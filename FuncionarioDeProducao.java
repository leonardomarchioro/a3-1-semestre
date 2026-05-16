public class FuncionarioDeProducao extends FuncionarioPadrao {
    public int totalPecas;
    public double valorPecas;

    public FuncionarioDeProducao(int id, String nome, double salarioBase, int totalPecas, double valorPecas) {
        super(id, nome, salarioBase);

        this.totalPecas = totalPecas;
        this.valorPecas = valorPecas;
    }

    public double calcularExtras() {
        double bonus = this.totalPecas * this.valorPecas;
        return bonus;
    }

    @Override
    public double calcularSalario() {
        double bonus = this.calcularExtras();
        return this.salario + bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Matricula: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário base: " + this.converterParaMoeda(this.getSalarioBase()));
        System.out.println("Produtividade: " + this.converterParaMoeda(this.calcularExtras()));
        System.out.println("Salário final: " + this.converterParaMoeda(this.calcularSalario()));
    }
}