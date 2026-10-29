package Modulo02_ContaBancaria;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public ContaBancaria setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }  else {
            System.out.println("Valor não permitido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0.0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else if (valor <= 0.0) {
                System.out.println("Saque inválido.");
        } else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirResumo() {
        System.out.println("===========CONTA BANCARIA===========");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Saldo Atual: R$ %.2f%n", this.saldo);
        System.out.println();
    }
}
