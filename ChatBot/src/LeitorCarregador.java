import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorCarregador {

    HashMap<String, PersoTest> lerPersonagens(String caminhoArquivoPersonagens)
    {

        HashMap<String, PersoTest> personagens = new HashMap<String, PersoTest>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);


        try {
           
            Scanner escanearArquivoPersonagens = new Scanner(arquivoPersonagens,"UTF-8"); 
            String nomePerso = "";
            String linhaScan = "";
            int energiaPerso = 0;

            while(escanearArquivoPersonagens.hasNextLine())
            {
                while(!linhaScan.equals("PERSONAGEM")){
                 linhaScan = escanearArquivoPersonagens.nextLine();
                 }
                linhaScan = escanearArquivoPersonagens.nextLine(); //Nome Perso
                 nomePerso = escanearArquivoPersonagens.nextLine();
                linhaScan = escanearArquivoPersonagens.nextLine(); // Energia Perso
                energiaPerso = Integer.parseInt(escanearArquivoPersonagens.nextLine());
                 personagens.put(nomePerso, new PersoTest(nomePerso,energiaPerso));
            }
            escanearArquivoPersonagens.close();
        
        } 
        catch (FileNotFoundException exception) {
            
            exception.printStackTrace();
        }
            return personagens;
    }
}
