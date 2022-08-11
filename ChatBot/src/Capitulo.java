import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.print.DocFlavor.STRING;

public class Capitulo {

    String nome;
    String texto;
    String [] escolhas;
    PersoTest personagem;
    int deltaStamina;
    Scanner input;
    

  Capitulo(String nome,
           String texto,
           String[] escolhas,
        PersoTest personagem,
        int deltaStamina, Scanner input)

{
    this.nome = nome ;
    this.texto =  texto;
    this.escolhas = escolhas;
    this.personagem = personagem;
    this.deltaStamina = deltaStamina;
    this.input = input;
    

}    
void  mostrar()
{
  System.out.println("......");
  System.out.println(this.nome);
  System.out.println(this.texto);
  this.personagem.deltaStamina(this.deltaStamina);
    
  if(this.escolhas != null)
  {
    for (String abacate : escolhas) 
    {
      System.out.println(abacate);
    }
  }
}

int escolhendo()
{
  int idEscolha = -1;
  if(escolhas != null)
  {     
    System.out.println("Digite sua escolha: ");
      String escolhaDigitada = input.nextLine();

    for (int i = 0; i < escolhas.length; i++) {
      if(escolhaDigitada.equals(escolhas[i]))
        {
          idEscolha = i;
        }
       
    }
      int   idAtual = 0; 
      
    
  }
  
  
  return idEscolha;   
}

}

