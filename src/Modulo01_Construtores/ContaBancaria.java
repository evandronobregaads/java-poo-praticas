package Modulo01_Construtores;

public class ContaBancaria {
    private String nomeTitular;
    private double saldoInicial;

    public ContaBancaria(String nomeTitular) {
        this(nomeTitular, 0.0);
    }

    public ContaBancaria(String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;

        if (saldoInicial > 0) {
            this.saldoInicial = saldoInicial;
        } else {
            this.saldoInicial = 0;
        }
    }

    public void exibirSaldo() {
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.printf("Saldo inicial: R$ %.2f%n" , this.saldoInicial);
    }

static class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Juan");
        ContaBancaria conta2 = new ContaBancaria("Pedro", 5000);
        ContaBancaria conta3 = new ContaBancaria("Bruno", -1000);
        ContaBancaria conta4 = new ContaBancaria("Miguel", 0);
        conta1.exibirSaldo();
        System.out.println("==========================");
        conta2.exibirSaldo();
        System.out.println("==========================");
        conta3.exibirSaldo();
        System.out.println("==========================");
        conta4.exibirSaldo();
        System.out.println("==========================");
    }
}
}