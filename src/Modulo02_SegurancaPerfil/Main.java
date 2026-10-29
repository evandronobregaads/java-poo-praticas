package Modulo02_SegurancaPerfil;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("evandromnjr", "123698745");
        Usuario usuario2 = new Usuario("juninhoevandro", "112233445566");

//        usuario1.isAtivo();
//        usuario1.exibirStatus();
//
//        usuario1.suspenderConta();
//        usuario1.exibirStatus();
//
//        usuario1.reativarConta();
//        usuario1.exibirStatus();

//        usuario1.alterarSenha("123698745","123456789");
//        usuario1.exibirStatus();

        usuario2.alterarSenha("321654987", "22121991");
        usuario2.exibirStatus();

        usuario2.alterarSenha("112233445566", "22121991");
        usuario2.exibirStatus();

        usuario2.alterarSenha("112233445566", "22121991");
        usuario2.exibirStatus();

    }
}
