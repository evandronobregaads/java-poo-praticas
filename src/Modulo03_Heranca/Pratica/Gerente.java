package Modulo03_Heranca.Pratica;

public class Gerente extends Funcionario {

    private double bonusGerente;

    public Gerente(String nome, double salario, double bonusGerente) {
        super(nome, salario);
        this.bonusGerente = bonusGerente;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + bonusGerente;
    };
}