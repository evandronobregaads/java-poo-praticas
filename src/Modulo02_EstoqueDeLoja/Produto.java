package Modulo02_EstoqueDeLoja;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido.");
        } else {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade de Estoque não pode ser negativo.");
        } else {
            this.quantidade = quantidade;
        }
    }

    public String aplicarDesconto(double porcentagem) {
        if (porcentagem >= 0.0 && porcentagem <= 50) {
            this.preco = this.preco - (this.preco * porcentagem/100.0);
            return String.format("O valor do produto com desconto é: R$ %.2f%n", this.preco);
        } else {
            return "A porcentagem de desconto não deve ser negativa ou ultrapassar 50%.";
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirProduto() {
        System.out.println("============PRODUTO============");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.printf("Preco do produto: R$ %.2f%n" , this.preco);
        System.out.println();

    }
}

