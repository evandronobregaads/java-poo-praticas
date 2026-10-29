package Modulo03_Heranca.Pratica;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro",3000);
        Funcionario funcionario2 = new Gerente("Maria",3000,800);

        funcionario1.exibirSalario();
        funcionario2.exibirSalario();
    }
}