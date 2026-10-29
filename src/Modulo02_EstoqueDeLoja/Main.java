package Modulo02_EstoqueDeLoja;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Lápis", 10.00, 50);

        produto1.exibirProduto();

        produto1.setPreco(-5.00);
        produto1.setQuantidade(-10);
        produto1.exibirProduto();

        produto1.aplicarDesconto(10);
        produto1.exibirProduto();

        produto1.aplicarDesconto(60);
        produto1.exibirProduto();
    }
}
