import java.util.Scanner;

public class Main {

    public class App {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            PersoTest geralt = new PersoTest("Geralt", 0);
            // PersoTest Ciri = new PersoTest("Ciri",50);

            Capitulos cap1 = new Capitulos("O encontro",
                    "Geralt o bruxo, estava voltando para a cidade após matar uma Banshee e acabou encontrando um duende."
                            +
                            "O duende faz a proposta de fazer várias perguntas a ele e se ele acabar acertando, ele ganha dinheiro, e sai do jogo"
                            +
                            "mas se ele perder, irá acabar lhe custando a vida. Geralt acaba aceitando o jogo do duende! "
                            +
                            "A primeira pergunta do duende é a seguinte: " +
                            " O que é preciso para matar uma bruxa ?",
                    // new String[]{ "Cajado Sagrado","Grimório"},
                    geralt,
                    50,
                    input);
            // cap1.mostrar();

            Capitulos cap2 = new Capitulos("Banshees",
                    "Agora, Geralt a pergunta será sobre Banshees" +
                            "Para Geralt será fácil, ele acabou de voltar de uma caçada a Banshees" +
                            "Qual é a comida preferida dos Banshees? ",
                    // new String[]{"Gado","Camponeses"},
                    geralt,
                    25,
                    input);
            // cap2.mostrar();

            Capitulos cap3 = new Capitulos("Bruxos",
                    "Serei bondoso com você Geralt, aqui vai uma pergunta sobre sua raça" +
                            "Qual a rua que os bruxos mais usam na estação do inverno ?",
                    // new String[]{"Mana","Fogo"},
                    geralt,
                    25,
                    input);
            // cap3.mostrar();

            Capitulos cap4 = new Capitulos("VOCÊ GANHOU! PARABÉNS",
                    "Tome aqui 100 moedas de ouro como recompensa !",
                    geralt,
                    100,
                    input);
            // Escolha Cajado Sagrado
            /*
             * Capitulos cap4 = new Capitulos("RESPOSTA CORRETA!",
             * "Você ganhou o jogo. Tome, 100 moedas de ouro. Até a próxima",
             * //null,
             * geralt,
             * 100,
             * input);
             * // cap4.mostrar();
             */

            Capitulos cap5 = new Capitulos("RESPOSTA ERRADA !",
                    "Então, como consequência, você irá me pagar com sua vida !",
                    // null,
                    geralt,
                    -100,
                    input);
            // cap5.mostrar();

            // Escolha Gado
            /*
             * Capitulos cap6 = new Capitulos("RESPOSTA ERRADA !",
             * "A resposta correta era 'Camponeses !'"+
             * "Então, como consequência, você irá me pagar com sua vida !",
             * //null,
             * geralt,
             * -100,
             * input);
             * //cap6.mostrar();
             */

            // Escolha Camponeses
            /*
             * Capitulos cap7 = new Capitulos("RESPOSTA CORRETA !",
             * "Parabéns, agora você pode sair do jogo!"+
             * "Tome aqui 100 moedas de ouros ",
             * //null,
             * geralt,
             * 100,
             * input);
             * //cap7.mostrar();
             */
            // Escolha Fogo
            /*
             * Capitulos cap9 = new Capitulos("RESPOSTA Correta !",
             * "Parabéns, agora você pode sair do jogo!"+
             * "Tome aqui 100 moedas de ouros",
             * geralt,
             * 100,
             * input);
             */

            cap1.escolhas.add(new Escolha("Cajado Sagrado", cap2));
            cap1.escolhas.add(new Escolha("Grimorio", cap5));
            cap2.escolhas.add(new Escolha("Gado", cap5));
            cap2.escolhas.add(new Escolha("Camponeses", cap3));
            cap3.escolhas.add(new Escolha("Mana", cap5));
            cap3.escolhas.add(new Escolha("Fogo", cap4));

            Capitulos raiz = cap1;
            raiz.mostrar();

            input.close();

        }
    }

}
