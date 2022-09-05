
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public class App {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            LeitorCarregador leitor = new LeitorCarregador();
            HashMap<String, PersoTest> personagens = leitor.lerPersonagens("rsc/personagens.txt");


            
            PersoTest geralt = personagens.get("Geralt");
            //PersoTest ciri = personagens.get("Ciri");

            HashMap<String, Capitulos> capitulos = leitor.lerCapitulos("rsc/capii.txt",
                                                                         personagens,
                                                                        input);
        
          


            Capitulos cap1 = capitulos.get("ENCONTRO");

           
                    

            Capitulos cap2 = capitulos.get("BANSHEES");
                    

            Capitulos cap3 = new Capitulos("Bruxos",
                    "Serei bondoso com você Geralt, aqui vai uma pergunta sobre sua raça" +
                            "Qual a rua que os bruxos mais usam na estação do inverno ?",
                    geralt,
                    25,
                    input);

            Capitulos cap4 = new Capitulos("VOCÊ GANHOU! PARABÉNS",
                    "Tome aqui 100 moedas de ouro como recompensa !",
                    geralt,
                    100,
                    input);
        

            Capitulos cap5 = new Capitulos("RESPOSTA ERRADA !",
                    "Então, como consequência, você irá me pagar com sua vida !",
                    geralt,
                    -100,
                    input);

            //cap1.escolhas.add(new Escolha("Cajado Sagrado", cap2));
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