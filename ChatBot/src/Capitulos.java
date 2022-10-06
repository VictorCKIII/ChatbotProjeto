import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulos {

    private  String nome;
    private String texto;
    protected ArrayList<Escolha> escolhas;
    private PersoTest personagem;
    private int deltaStamina;
    
    protected Capitulos() {}

  public Capitulos(
        String nome,
        String texto,
        PersoTest personagem,
        int deltaStamina)
{
    this.nome = nome ;
    this.texto =  texto;
    this.personagem = personagem;
    this.deltaStamina = deltaStamina;
    this.escolhas = new ArrayList<Escolha>();
    

}    
public Capitulos(
          HashMap<String, PersoTest> personagens, 
            Scanner escaneadorArquivoCapitulos) 
{
  this.ler(personagens, escaneadorArquivoCapitulos);
  this.escolhas = new ArrayList<Escolha>();
}

private int escolhendo()
{
  int idEscolha = -1;


  if(escolhas != null)
  {     
    while(idEscolha == -1)
    {
    
    System.out.println("Digite sua escolha: ");
   
     // String escolhaDigitada = input.nextLine();

    for (int i = 0; i < escolhas.size(); i++) {
     //if(escolhaDigitada.equals(escolhas.get(i).getTexto()))
      //  {
      //    idEscolha = i;
      //  }
      }
    }  
  }

  return idEscolha;   
}
  protected void ler(
              HashMap<String, PersoTest> personagens,  
              Scanner escaneadorArquivoCapitulos) 
  {
        String linhaEscaneada;

       // this.input = escaneadorConsole;

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

  public String getTitulo() {
    return null;
  }

public String getTexto() {
    return this.texto;
}

public String alterarEnergiaPerso() {
 return this.personagem.deltaStamina(this.deltaStamina);
}

public ArrayList<Escolha> getEscolhas() {
  return this.escolhas;
}
}

