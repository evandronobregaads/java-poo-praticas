package Modulo02_SegurancaPerfil;

public class Usuario {
    private String nome;
    private String senha;
    private boolean statusAtivo;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.statusAtivo = true;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return statusAtivo;
    }


    public void suspenderConta() {
        statusAtivo = false;
        System.out.println("Conta Suspensa.");
    }

    public void reativarConta() {
        statusAtivo = true;
        System.out.println("Conta Ativa.");
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(senha)) {
            this.senha = senhaNova;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha Inválida.");
        }
    }

    public void exibirStatus() {
        System.out.println("Usuário: " + this.nome);
        System.out.println("Status: " + this.statusAtivo);
        System.out.println();
    }
}