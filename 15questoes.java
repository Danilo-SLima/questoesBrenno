import java.util.Scanner;

public class questoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntas e opções
        String[] perguntas = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };

        String[][] opcoes = {
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
        };

        int[] respostasCorretas = {4, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int pontos = 0;

        // Loop para exibir cada pergunta e verificar a resposta
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            for (String opcao : opcoes[i]) {
                System.out.println(opcao);
            }

            System.out.print("Digite o número da sua resposta: ");
            int respostaUsuario = scanner.nextInt();

            if (respostaUsuario == respostasCorretas[i]) {
                pontos++;
                System.out.println("Parabéns! Você acertou.\n");
            } else {
                System.out.println("Resposta incorreta.\n");
            }
        }

        // Exibe a pontuação final
        System.out.println("Sua pontuação final: " + pontos + " de " + perguntas.length);

        scanner.close();
    }
}
