import java.util.Scanner;

public class questoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntas e opções
        String[] perguntas = {
                "Qual é o planeta mais próximo do Sol?",
                "Qual é a capital da França?",
                "Quantos continentes existem na Terra?",
                "Qual é o elemento químico representado pela letra \"O\" na tabela periódica?",
                "Quem escreveu \"Dom Quixote\"?",
                "Qual é a fórmula química da água?",
                "Em que ano o homem pisou na Lua pela primeira vez?",
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
                {"1. Terra", "2. Marte", "3. Júpiter", "4. Mercúrio", "5. Vênus"},
                {"1. Berlim", "2. Londres", "3. Roma", "4. Paris", "5. Madri"},
                {"1. 5 continentes", "2. 6 continentes", "3. 7 continentes", "4. 8 continentes", "5. 9 continentes"},
                {"1. Oxigênio", "2. Ouro", "3. Ósmio", "4. Óxido", "5. Olíbdeno"},
                {"1. William Shakespeare", "2. Gabriel García Márquez", "3. Miguel de Cervantes", "4. Fernando Pessoa", "5. João Guimarães Rosa"},
                {"1. H2", "2. CO2", "3. O2", "4. H2O", "5. HCl"},
                {"1. 1965", "2. 1969", "3. 1972", "4. 1980", "5. 1990"},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
                {"1. ", "2. ", "3. ", "4. ", "5. "},
        };

        int[] respostasCorretas = {4, 4, 3, 1, 3, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0};
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
