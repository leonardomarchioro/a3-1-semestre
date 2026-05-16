
public class FuncionarioComissionado extends FuncionarioPadrao {
    public double totalVendas;
    public double porcentagem;

    public FuncionarioComissionado(int id, String nome, double salarioBase, double totalVendas, double porcentagem) {
        super(id, nome, salarioBase);
        this.totalVendas = totalVendas;
        this.porcentagem = porcentagem;
    }

    public double calcularComissao() {
        double comissao = this.totalVendas * (this.porcentagem / 100);
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double comissao = this.calcularComissao();
        return this.salario + comissao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Matricula: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário base: " + this.converterParaMoeda(this.getSalarioBase()));
        System.out.println("Comissão: " + this.converterParaMoeda(this.calcularComissao()));
        System.out.println("Salário final: " + this.converterParaMoeda(this.calcularSalario()));
    }
}
