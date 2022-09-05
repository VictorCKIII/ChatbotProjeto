
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
        
        


            Capitulos raiz = capitulos.get("ENCONTRO");
                    
          // Capitulos cap2 = capitulos.get("BANSHEES");                  

            //Capitulos cap3 = capitulos.get("BRUXOS");

           // Capitulos cap4 = capitulos.get("GANHOU");

          //  Capitulos cap5 = capitulos.get("PERDEU");

            //cap1.escolhas.add(new Escolha("Cajado Sagrado", cap2));
            //cap1.escolhas.add(new Escolha("Grimorio", cap5));
            //cap2.escolhas.add(new Escolha("Gado", cap5));
            //cap2.escolhas.add(new Escolha("Camponeses", cap3));
            //cap3.escolhas.add(new Escolha("Mana", cap5));
            //cap3.escolhas.add(new Escolha("Fogo", cap4));

           
            raiz.mostrar();

            input.close();

        }
    }

}