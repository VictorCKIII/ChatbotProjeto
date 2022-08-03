import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    PersoTest personagem;
    int deltaStamina;
    Scanner input ;

  Capitulo(String nome,
           String texto,
           String escolha1,
           String escolha2,
        PersoTest personagem,
        int deltaStamina, Scanner input)

{
    this.nome = nome ;
    this.texto =  texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
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
}

int escolhendo()
{
  int escolhendo1 = -1;

  if(this.escolha1 != null || this.escolha2 != null)
  {
    String tomo = input.nextLine();
    if(tomo.equalsIgnoreCase(escolha1)) {
      escolhendo1 = 1;
    }
    else if(tomo.equalsIgnoreCase(escolha2)){
      escolhendo1 = 2;
    }
  }

  return escolhendo1;
}

}

