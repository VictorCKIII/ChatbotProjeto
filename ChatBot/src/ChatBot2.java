import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class ChatBot2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("........");
        System.out.println("Olá, como você se chama?");
        String nome = input.next();
        System.out.println("Olá," + nome +" me chamo Geralt e você acaba de se juntar a sociedade dos bruxos,mas antes você precisará escolher em qual tipo de magia se especializar")
        ;
        System.out.println("Sim, eu sei que você deve estar confuso, mas resumindo, você morreu e reencarnou aqui :) ");
        System.out.println("Então, qual o tipo de magia você escolhe?");
        String magia = input.next();
        //System.out.println(magia.toLowerCase());

        if(magia.equals("Fogo")){
            System.out.println("Hm, uma magia deveras interessante mas um pouco complexa de se usar deseja mesmo assim? ");


        }else if(magia.equals("Ar")) {
            System.out.println("Hm, uma magia que você poderá utilizar facilmente, porém, dependendo do oponente ela não terá a menor eficácia deseja mesmo assim?");

        }else if(magia.equals("Terra")) {
            System.out.println("Hm, assim como o Ar, essa magia é fácil de usar, mas dependendo do oponente não fará nenhum efeito, deseja usar mesmo assim ?");

        }else if(magia.equals("Água")) {
            System.out.println("Hm, ótima escolha, essa magia consegue se destacar em combate contra todas as outras, apenas contra o Ar que acaba deixando um pouco a desejar! Deseja escolher mesmo assim?");
        }
       
        
       

    }
}
