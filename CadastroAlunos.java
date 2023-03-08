import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[25];

        // Cadastro dos primeiros 25 alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i+1);
            alunos[i] = scanner.nextLine();
        }

        // Impressão dos alunos cadastrados
        System.out.println("Alunos cadastrados:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("%d. %s\n", i+1, alunos[i]);
        }

        // Cadastro de mais 5 alunos
        String[] novosAlunos = new String[5];
        for (int i = 0; i < novosAlunos.length; i++) {
            System.out.printf("\nDigite o nome do novo aluno %d: ", i+1);
            novosAlunos[i] = scanner.nextLine();
        }

        // Concatenação dos arrays de alunos
        String[] alunosAtualizados = new String[alunos.length + novosAlunos.length];
        System.arraycopy(alunos, 0, alunosAtualizados, 0, alunos.length);
        System.arraycopy(novosAlunos, 0, alunosAtualizados, alunos.length, novosAlunos.length);

        // Impressão dos alunos atualizados
        System.out.println("Alunos atualizados:");
        for (int i = 0; i < alunosAtualizados.length; i++) {
            System.out.printf("%d. %s\n", i+1, alunosAtualizados[i]);
        }
    }
}
