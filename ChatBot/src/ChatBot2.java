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

        if(magia.equals("Fogo")){
            System.out.println("Hm, uma magia deveras interessante mas um pouco complexa de se usar");
            System.out.println("Deseja continuar mesmo assim?");
            String escolha = input.next();
            if(escolha.equals("Sim")){
               System.out.println("Parabéns, você agora possui a magia de fogo, começe a treinar o quanto antes para subir de nível !");
               System.out.println("Você prefere ir upar contra monstros ou ficar no castelo ?"); 
                String lugar  = input.next();
                if(lugar.equals("Upar")) {
                    System.out.println("Você foi upar, acabou encontrando um boss e acabou morrendo. Sua jornada acaba aqui :) ");

                }
                else if (lugar.equals("Castelo")) {
                    System.out.println("Boa escolha, você não podia sair pois estava sem armadura, quase ia me esqueçendo !");
                    System.out.println("Agora, diga-me, você gostaria de beber um gole desta poção que deixaria você mais forte ?");
                    String pot = input.next();
                    if(pot.equals("Sim")) {
                        System.out.println("Você não resistiu aos efeitos colaterais da poção e morreu ali mesmo. Sua jornada acaba aqui !");

                    } else {
                        System.out.println("Ainda bem, você não iria resistir aos efeitos mesmo :) ");
                        System.out.println("......... Mutildão gritando fora do castelo");
                        System.out.println("O rei se revoltou contra os bruxos por conta de uma garrafa de cerveja e mandou matarem todos os bruxos");
                        System.out.println("Corra," + nome+ " Eu e os bruxos anciões tentaremos segurar o máximo possível. Disse Geralt.");
                        System.out.println("O que você irá fazer ? Correr ou Ficar");
                        String fuga = input.next();
                        if(fuga.equals("Correr")) {
                            System.out.println("Você tentou tentou fugir pelos fundos do castelo mas acabou tropeçando na escada e quebrou o pescoço na queda! Sua jornada acaba aqui ! ");
                            
                        } else {
                            System.out.println("Você ficou para lutar e ajudar os outros, mas sua falta de experiência em batalha lhe custou a vida e você morreu depois de levar uma pedrada na cabeça ! Sua jornada acaba aqui !");
                        }

                }       
                        


                }

                }
            


            
            else{
                System.out.println("Ah, que pena! Tente escolher outra depois de se apresentar novamente :) ");
            
            }










        }else if(magia.equals("Ar")) {
            System.out.println("Hm, uma magia que você poderá utilizar facilmente, porém, dependendo do oponente ela não terá a menor eficácia deseja mesmo assim?");

        }else if(magia.equals("Terra")) {
            System.out.println("Hm, assim como o Ar, essa magia é fácil de usar, mas dependendo do oponente não fará nenhum efeito, deseja usar mesmo assim ?");

        }else if(magia.equals("Água")) {
            System.out.println("Hm, ótima escolha, essa magia consegue se destacar em combate contra todas as outras, apenas contra o Ar que acaba deixando um pouco a desejar! Deseja escolher mesmo assim?    ");
        }
       
        
       

    }
}
