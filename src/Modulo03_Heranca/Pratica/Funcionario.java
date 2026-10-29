package Modulo03_Heranca.Pratica;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularPagamento() {
        return this.salario;
    }

    public void exibirSalario() {
        System.out.println("Nome do Funcionário: " + this.nome);
        System.out.printf("Salário: R$ %.2f%n", calcularPagamento());
    }
}