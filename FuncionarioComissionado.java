
public class FuncionarioComissionado extends FuncionarioPadrao {
    public double totalVendas;
    public double porcentagem;

    public FuncionarioComissionado (String nome, String id, double totalVendas, double porcentagem){
        super(nome, id);

        this.totalVendas = totalVendas;
        this.porcentagem = porcentagem;
    }

    @Override
    public double calcularSalario() {
        double comissao = this.totalVendas * (this.porcentagem / 100);
        return this.salario + comissao;
    }
}
