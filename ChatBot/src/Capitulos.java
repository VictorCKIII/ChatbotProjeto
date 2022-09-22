import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulos {

    private  String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private PersoTest personagem;
    private int deltaStamina;
    private Scanner input;
    

  public Capitulos(String nome,
           String texto,
        PersoTest personagem,
        int deltaStamina, Scanner input)
{
    this.nome = nome ;
    this.texto =  texto;
    this.personagem = personagem;
    this.deltaStamina = deltaStamina;
    this.input = input;
    this.escolhas = new ArrayList<Escolha>();
    

}    
public Capitulos(HashMap<String, PersoTest> personagens, 
Scanner escaneadorConsole,
Scanner escaneadorArquivoCapitulos) 
{
  this.ler(personagens, escaneadorConsole, escaneadorArquivoCapitulos);
  this.escolhas = new ArrayList<Escolha>();
}

public void  mostrar()
{
  this.personagem.deltaStamina(this.deltaStamina);
  System.out.println("......");
  System.out.println(this.nome);
  System.out.println(this.texto);
    
  if(this.escolhas.size() > 0)
  {
    for (Escolha abacate : escolhas) 
    {
      System.out.println(abacate.getTexto());
    }
      int escolha3 = escolhendo();
      this.escolhas.get(escolha3).getProx().mostrar();      
  }
}

private int escolhendo()
{
  int idEscolha = -1;


  if(escolhas != null)
  {     
    while(idEscolha == -1)
    {
    
    System.out.println("Digite sua escolha: ");
   
      String escolhaDigitada = input.nextLine();

    for (int i = 0; i < escolhas.size(); i++) {
      if(escolhaDigitada.equals(escolhas.get(i).getTexto()))
        {
          idEscolha = i;
        }
      }
    }  
  }

  return idEscolha;   
}
  private void ler(HashMap<String, PersoTest> personagens, 
                            Scanner escaneadorConsole, 
                            Scanner escaneadorArquivoCapitulos) {

      
        String linhaEscaneada = "";

        this.input = escaneadorConsole;
        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Nome
         this.nome = escaneadorArquivoCapitulos.nextLine();

         linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Texto
         this.texto = escaneadorArquivoCapitulos.nextLine(); 

         linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Personagem
         this.personagem = personagens.get(escaneadorArquivoCapitulos.nextLine()); 

         linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Variação De Energia
         this.deltaStamina = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());

         }

  public void adicionarEscolha(Escolha escolha)
  {
    this.escolhas.add(escolha);
  }
  public String getNome() {
    return this.nome;
  }
}

