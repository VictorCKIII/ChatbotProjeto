import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.print.DocFlavor.STRING;

public class Capitulos {

    String nome;
    String texto;
    ArrayList<Escolha> escolhas;
    PersoTest personagem;
    int deltaStamina;
    Scanner input;
    

  Capitulos(String nome,
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
void  mostrar()
{
  System.out.println("......");
  System.out.println(this.nome);
  System.out.println(this.texto);
  this.personagem.deltaStamina(this.deltaStamina);
    
  if(this.escolhas.size() > 0)
  {
    for (Escolha abacate : escolhas) 
    {
      System.out.println(abacate.texto);
    }
      int escolha3 = escolhendo();
      this.escolhas.get(escolha3).proximo.mostrar();      
  }
}

int escolhendo()
{
  int idEscolha = -1;


  if(escolhas != null)
  {     
    while(idEscolha == -1)
    {
    
    System.out.println("Digite sua escolha: ");
   
      String escolhaDigitada = input.nextLine();

    for (int i = 0; i < escolhas.size(); i++) {
      if(escolhaDigitada.equals(escolhas.get(i).texto))
        {
          idEscolha = i;
        }
      }
    }  
  }

  return idEscolha;   
}

}

