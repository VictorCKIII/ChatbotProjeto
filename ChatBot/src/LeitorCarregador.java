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
             Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");

             String nomePersonagem = "";
             String linhaEscaneada = "";
             int energiaPersonagem = 0;

             while(escaneadorArquivoPersonagens.hasNextLine())
             {
                 while(!linhaEscaneada.equals("PERSONAGEM"))
                 {
                    linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
                 }
                 linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); // Nome
                 nomePersonagem = escaneadorArquivoPersonagens.nextLine(); 
                 linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); // Energia
                 energiaPersonagem = Integer.parseInt(escaneadorArquivoPersonagens.nextLine()); 
                 personagens.put(nomePersonagem, new PersoTest(nomePersonagem, energiaPersonagem));
             }

             escaneadorArquivoPersonagens.close();
        } 
        catch (FileNotFoundException exception) 
        {  
            exception.printStackTrace();
        }

        return personagens;

    }
}
