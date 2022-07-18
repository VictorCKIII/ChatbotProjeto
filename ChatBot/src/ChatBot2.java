import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class ChatBot2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("........");
        System.out.println("Olá, como você se chama?");
        String nome = input.next();
        System.out.println("Olá," + nome +" me chamo Geralt e você acaba de se juntar a sociedade dos bruxos,mas antes você precisará escolher em qual tipo de magia se especializar");
        System.out.println("Só existem 2 tipos de magia: Fogo e Água");
        ;
        System.out.println("Sim, eu sei que você deve estar confuso, mas resumindo, você morreu e reencarnou aqui :) ");
        System.out.println("Então, qual o tipo de magia você escolhe?");
        String magia = input.next();

        if(magia.equalsIgnoreCase("Fogo")){
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

        }else {
            System.out.println("Hm, uma magia que você poderá utilizar facilmente, porém, dependendo do oponente ela não terá a menor eficácia deseja mesmo assim?");
            System.out.println("Deseja continuar mesmo assim ? ");  
            String escolha1 = input.next();
            if(escolha1.equalsIgnoreCase("Sim")) {
                System.out.println("Meus parabéns, você agora possui a magia da água e com ela veio junto este pequeno golfinho para ser seu pet");
                System.out.println("Agora, existe um ritual que após receber a magia da água você deve nadar no lago sagrado. Ninguém nunca deixou de nadar nesse lago após a benção da magia!");
                System.out.println("Você deseja ir nadar ?");
                String nadar = input.next();
                if(nadar.equalsIgnoreCase("Sim")) {
                    System.out.println("Ótimo, você acabou se fortalecendo ainda mais e seu pet acabou de evoluir para um Tubarão que tem consciência e consegue se comunicar com humanos");
                    System.out.println("OBS: Ele deseja ser chamado de Tutubarão agora...");
                    System.out.println("Vocês foram convocados pelo rei para tentar lidar com um monstro que tem matado muitos camponeses recentemente");
                    System.out.println("Você deseja ir até o rei?");
                    String ida = input.next();
                    if(ida.equalsIgnoreCase("Sim")) {
                        System.out.println("Era uma armadilha, o rei não gosta de bruxos e nunca gostou. Você acabou morrendo envenenado com um copo de vinho ! A sua jornada acaba aqui ");
                        
                    } else {
                        System.out.println("Você optou por não ir, e o rei se sentiu ofendido e acabou mandando o exército para o castelo dos bruxos !");
                        System.out.println("Os bruxos por sua vez não queriam arrumar briga e entregaram você para o rei. O rei decaptou você naquela mesma tarde! A sua jornada acaba aqui");
                    }

                }else {
                    System.out.println("Você não nadou e acabou sendo morto pelos espíritos das águas pela falta de respeito que você teve com o ritual. Sua jornada acaba aqui !");
                }
            }         
                    
            else{
                System.out.println("Ah, que pena, tente escolher outra se apresentando novamente :) ");
            }
    }
}
}