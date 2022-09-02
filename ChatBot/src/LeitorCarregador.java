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

    HashMap<String, Capitulos> lerCapitulos(
             String caminhoArquivoCapitulos,
             HashMap<String, PersoTest> personagens,
             Scanner escaneadorConsole)
    {
        HashMap<String, Capitulos> capitulos = new HashMap<String, Capitulos>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
             Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

             String nomeCapitulo = "";
             String textoCapitulo = "";
             String nomePersonagem = "";
             int variacaoEnergia = 0;
             String linhaEscaneada = "";

             while(escaneadorArquivoCapitulos.hasNextLine())
             {
                 while(!linhaEscaneada.equals("CAPITULO"))
                 {
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
                 }
                 linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Nome
                 nomeCapitulo = escaneadorArquivoCapitulos.nextLine();
                 linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Texto
                 textoCapitulo = escaneadorArquivoCapitulos.nextLine(); 
                 linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Personagem
                 nomePersonagem = escaneadorArquivoCapitulos.nextLine(); 
                 linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Variação De Energia
                 variacaoEnergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine()); 
                 capitulos.put(nomeCapitulo, new Capitulos(nomeCapitulo, 
                                                           textoCapitulo, 
                                                           personagens.get(nomePersonagem), 
                                                           variacaoEnergia,
                                                           escaneadorConsole));
             }

             escaneadorArquivoCapitulos.close();
        } 
        catch (FileNotFoundException exception) 
        {  
            exception.printStackTrace();
        }

        return capitulos;

    }
}
