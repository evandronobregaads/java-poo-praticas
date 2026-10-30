import java.util.Scanner;

public class Main {

    public int corrigirProva(Scanner sc, char[] gabarito) {
        int acertos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Resposta da questão " + (i + 1) + ": ");
            char resposta = sc.next().toUpperCase().charAt(0);

            if (resposta == gabarito[i]) {
                acertos++;
            }
        }
        return acertos;
    }

    public void aplicarProva() {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};

        int totalAlunos = 0;
        int somaNotas = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;

        String continuar;

        do {
            System.out.println("\nAluno " + (totalAlunos + 1));
            int nota = corrigirProva(sc, gabarito);

            System.out.println("Total de acertos: " + nota);
            System.out.println("Nota do aluno " + (nota));

            totalAlunos++;
            somaNotas += nota;

            if (nota > maiorAcerto) {
                maiorAcerto = nota;
            }

            if (nota < menorAcerto) {
                menorAcerto = nota;
            }

            System.out.println("\nOutro aluno vai responder? (S/N): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("S"));

        double media = (double) somaNotas / totalAlunos;
        System.out.println("\n===== RESULTADO DA TURMA =====");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.printf("Média da turma: %.2f%n", media);

        sc.close();
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.aplicarProva();
    }
}