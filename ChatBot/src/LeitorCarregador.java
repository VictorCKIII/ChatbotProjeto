import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

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


    HashMap<String, Capitulos> lerCapitulos(String caminhoArquivoCapitulos,
    HashMap<String, PersoTest> personagens,
     Scanner escanearConsole)
    {
        HashMap<String, Capitulos> capitulos = new HashMap<String, Capitulos>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);


        try {
           
            Scanner escanearArquivoCapitulos = new Scanner(arquivoCapitulos,"UTF-8"); 
            String nomeCapitulo = "";
            String textoCapitulo = "";
            String nomePerso = "";
            int variacaoEnergia = 0;
            String linhaScan = "";

            while(escanearArquivoCapitulos.hasNextLine())
            {
                while(!linhaScan.equals("CAPITULO"))
                {
                 linhaScan = escanearArquivoCapitulos.nextLine();
                 }
                linhaScan = escanearArquivoCapitulos.nextLine(); //Nome 
                nomeCapitulo = escanearArquivoCapitulos.nextLine();
                linhaScan = escanearArquivoCapitulos.nextLine(); //TEXTO
                textoCapitulo = escanearArquivoCapitulos.nextLine();
                linhaScan = escanearArquivoCapitulos.nextLine(); // PERSONAGEM
                nomePerso = escanearArquivoCapitulos.nextLine(); 
                linhaScan = escanearArquivoCapitulos.nextLine(); //  Var Energia Cap
                variacaoEnergia = Integer.parseInt(escanearArquivoCapitulos.nextLine());
                 capitulos.put(nomeCapitulo, new Capitulos(nomeCapitulo,
                                                        textoCapitulo,
                                                        personagens.get(nomePerso),
                                                         variacaoEnergia,
                                                         escanearConsole));
            }
            escanearArquivoCapitulos.close();
        
        } 
        catch (FileNotFoundException exception) {
            
            exception.printStackTrace();
        }
            return capitulos; 
    }
    
}
