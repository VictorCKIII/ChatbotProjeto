import java.util.Scanner;

public class Capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    PersoTest personagem;
    int deltaStamina;

  Capitulo(String nome,
           String texto,
           String escolha1,
           String escolha2,
        PersoTest personagem,
        int deltaStamina)

{
    this.nome = nome ;
    this.texto =  texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.personagem = personagem;
    this.deltaStamina = deltaStamina;


}    
void  mostrar()
{
  System.out.println("......");
  System.out.println(this.nome);
  System.out.println(this.texto);
  this.personagem.deltaStamina(this.deltaStamina);
}

//int escolher()

  //int op = - 1;

  //if(escolha1 != null || escolha2 != null )
  
    //Scanner input = new Scanner(System.in);
   // int  escolhap  = input.nextInt();
    //  if(escolhap.equals(escolha1))
    //  {
    //    op = 1;
     // }
     // else if (escolhap.equals(escolha2))
     // {
     //   op =2 ;
     // }
     // input.close();
  //}


  //return op;
}

