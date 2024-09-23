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
                "Qual animal é conhecido por sua capacidade de mudar de cor?",
                "Qual país é famoso por sua Torre Eiffel?",
                "Qual é o maior oceano da Terra?",
                "Quem pintou a Mona Lisa?",
                "Quantos lados tem um hexágono?",
                "Qual é a maior montanha do mundo?",
                "Qual é o idioma mais falado no mundo?",
                "Quantos planetas compõem o sistema solar?"
        };

        String[][] opcoes = {
                {"1. Terra", "2. Marte", "3. Júpiter", "4. Mercúrio", "5. Vênus"},
                {"1. Berlim", "2. Londres", "3. Roma", "4. Paris", "5. Madri"},
                {"1. 5 continentes", "2. 6 continentes", "3. 7 continentes", "4. 8 continentes", "5. 9 continentes"},
                {"1. Oxigênio", "2. Ouro", "3. Ósmio", "4. Óxido", "5. Olíbdeno"},
                {"1. William Shakespeare", "2. Gabriel García Márquez", "3. Miguel de Cervantes", "4. Fernando Pessoa", "5. João Guimarães Rosa"},
                {"1. H2", "2. CO2", "3. O2", "4. H2O", "5. HCl"},
                {"1. 1965", "2. 1969", "3. 1972", "4. 1980", "5. 1990"},
                {"1. Camaleão", "2. Elefante", "3. Leão", "4. Pinguim", "5. Baleia"},
                {"1. Itália", "2. Reino Unido", "3. França", "4. Estados Unidos", "5. Alemanha"},
                {"1. Oceano Atlântico", "2. Oceano Pacífico", "3. Oceano Índico", "4. Oceano Ártico", "5. Oceano Antártico"},
                {"1. Pablo Picasso", "2. Leonardo da Vinci", "3. Vincent van Gogh", "4. Michelangelo", "5. Salvador Dalí"},
                {"1. 4 lados", "2. 5 lados", "3. 6 lados", "4. 7 lados", "5. 8 lados"},
                {"1. Monte Kilimanjaro", "2. Monte Everest", "3. Mont Blanc", "4. Monte Aconcágua", "5. Monte Fuji"},
                {"1. Espanhol", "2. Inglês", "3. Mandarim", "4. Árabe", "5. Hindi"},
                {"1. 7 planetas", "2. 8  planetas", "3. 9 planetas", "4. 10 planetas", "5. 11 planetas"},
        };

        int[] respostasCorretas = {4, 4, 3, 1, 3, 4, 2, 1, 3, 2, 2, 3, 2, 3, 2};
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
