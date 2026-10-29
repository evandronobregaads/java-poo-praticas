package Modulo00;

public class Produto {
    String nome;
    public double preco;
    public int estoque;

    public void vender(int quantidade){
        if (estoque > 0 && estoque >= quantidade && quantidade > 0) {
            double venda = quantidade * preco;
            this.estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
            System.out.printf("Valor da Venda: R$ %.2f%n", venda);
        } else {
            System.out.println("Venda Recusada!");
        }
    }

    static class Main {
        public static void main (String[] args) {

            Produto produto1 = new Produto();
            produto1.preco = 20;
            produto1.estoque = 10;

            produto1.vender(3);
            System.out.println("Estoque atual: " + produto1.estoque);
            System.out.println("=================");
            produto1.vender(12);
            System.out.println("Estoque atual: " + produto1.estoque);
            System.out.println("=================");
            produto1.vender(0);
            System.out.println("Estoque atual: " + produto1.estoque);
            System.out.println("=================");
            produto1.vender(-2);
            System.out.println("Estoque atual: " + produto1.estoque);
            System.out.println("=================");
            produto1.vender(7);
            System.out.println("Estoque atual: " + produto1.estoque);
            System.out.println("=================");
        }
    }
}
