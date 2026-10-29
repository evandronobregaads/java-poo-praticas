package Modulo02_ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("123456-7","Evandro");
//        ContaBancaria conta2 = new ContaBancaria("987654-7","Juan");
//        ContaBancaria conta3 = new ContaBancaria("654789-2","Maria");

        conta1.exibirResumo();
        conta1.depositar(500.0);
        conta1.exibirResumo();
        conta1.depositar(-100);
        conta1.exibirResumo();
        conta1.depositar(0.0);
        conta1.exibirResumo();
        conta1.sacar(250.0);
        conta1.exibirResumo();
        conta1.sacar(600.0);
        conta1.exibirResumo();
        conta1.sacar(-50.0);
        conta1.exibirResumo();

    }
}
