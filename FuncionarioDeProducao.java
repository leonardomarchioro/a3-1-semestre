public class FuncionarioDeProducao extends FuncionarioPadrao {
    public int totalPecas;
    public double valorPecas;

    public FuncionarioDeProducao (String nome, String id, int totalPecas, double valorPecas){
        super(nome, id);

        this.totalPecas = totalPecas;
        this.valorPecas = valorPecas;
    }

    @Override
    public double calcularSalario() {
        double bonus = this.totalPecas * this.valorPecas;
        return this.salario + bonus;
    }
}
