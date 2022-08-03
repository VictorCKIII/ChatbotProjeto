import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class ChatBot2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("........");
      
       System.out.println("Digite o número do personagem que  que você quer jogar !");
       System.out.println(" 1- Biliro");
       System.out.println(" 2- Bilirinho");

        int escolhap  = input.nextInt();
        
        PersoTest perso = new PersoTest("Bilirio",100);
        PersoTest perso2 = new PersoTest("Bilirinho", 100);
        
        
       if(escolhap == 1) {
       
        Capitulo cap1 = new Capitulo("Escolhendo suas Magias", "Neste mundo possuímos 2 tipos de magias: Fogo e Água! Escolha entre Fogo e Água  ", "Fogo", "Água",perso, 100);
        cap1.mostrar();
        //System.out.println("CAPÍTULO 1- ESCOLHENDO MAGIA ");
        //System.out.println("Olá Biliro,me chamo Geralt e você acaba de se juntar a sociedade dos bruxos,mas antes você precisará escolher em qual tipo de magia se especializar");
        //System.out.println("Só existem 2 tipos de magia: Fogo e Água");
       // ;
       // System.out.println("Sim, eu sei que você deve estar confuso, mas resumindo, você morreu e reencarnou aqui :) ");
       // System.out.println("Então, qual o tipo de magia você escolhe?");
        //System.out.println("- Fogo");
       // System.out.println("- Água");
        String magia = input.next();

        if(magia.equalsIgnoreCase("Fogo")){
            System.out.println("Hm, uma magia deveras interessante mas um pouco complexa de se usar");
            System.out.println("Deseja continuar mesmo assim?");
            String escolha = input.next();
            if(escolha.equalsIgnoreCase("Sim")){
                Capitulo cap2 = new Capitulo("PRIMEIRA ESCOLHA ", "VOCÊ POSSUI A MAGIA DE FOGO! Agora, escolha entre Upar e Castelo", "Upar", "Castelo", perso, 50);
                cap2.mostrar();
              // System.out.println("Parabéns, Biliro  você agora possui a magia de fogo, começe a treinar o quanto antes para subir de nível !");
               //System.out.println("Você prefere ir upar contra monstros ou ficar no castelo ?"); 
               System.out.println("- Upar");
               System.out.println("- Castelo");
                String lugar  = input.next();
               
                if(lugar.equalsIgnoreCase("Upar")) {
                    System.out.println("Você foi upar, acabou encontrando um boss e acabou morrendo. Sua jornada acaba aqui :) ");
                    perso.deltaStamina(-100);
                }
                else if (lugar.equalsIgnoreCase("Castelo")) {
                    System.out.println("Boa escolha, você não podia sair pois estava sem armadura, quase ia me esqueçendo !");
                    perso.deltaStamina(+50);
                    Capitulo cap3 = new Capitulo("BEBENDO POÇÃO", "VOCÊ ESTÁ PRESTES A BEBER A POÇÃO", "Sim","Não", perso, -20);
                    //System.out.println("CAPÍTULO 3 - BEBENDO POÇÃO");
                    System.out.println("Agora, diga-me, você gostaria de beber um gole desta poção que deixaria você mais forte ?");
                    System.out.println(" - Sim");
                    System.out.println(" - Não");
                    String pot = input.next();
                    if(pot.equalsIgnoreCase("Sim")) {
                        System.out.println("Você não resistiu aos efeitos colaterais da poção e morreu ali mesmo. Sua jornada acaba aqui !");
                        perso.deltaStamina(- 100);

                    } else {
                        System.out.println("Ainda bem, você não iria resistir aos efeitos mesmo :) ");
                      // System.out.println("......... Mutildão gritando fora do castelo");
                       // System.out.println("O rei se revoltou contra os bruxos por conta de uma garrafa de cerveja e mandou matarem todos os bruxos");
                        //System.out.println("Corra, Eu e os bruxos anciões tentaremos segurar o máximo possível. Disse Geralt.");
                        //System.out.println("O que você irá fazer ? Correr ou Ficar");
                        //System.out.println("- Correr");
                       // System.out.println("- Ficar");
                        // String fuga = input.next();

                        //if(fuga.equalsIgnoreCase("Correr")) {
                           // System.out.println("Você tentou tentou fugir pelos fundos do castelo mas acabou tropeçando na escada e quebrou o pescoço na queda! Sua jornada acaba aqui ! ");
                           // perso.deltaStamina(-100);
                       // } else {
                            //System.out.println("Você ficou para lutar e ajudar os outros, mas sua falta de experiência em batalha lhe custou a vida e você morreu depois de levar uma pedrada na cabeça ! Sua jornada acaba aqui !");
                         //  perso.deltaStamina(-100);
                       // }
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
                Capitulo cap5 = new Capitulo("CAPÍTULO 5", "RITUAL DA ÁGUA", "Sim ", "Não", perso , -50);
                //System.out.println("Meus parabéns, você agora possui a magia da água e com ela veio junto este pequeno golfinho para ser seu pet");
               // System.out.println("Agora, existe um ritual que após receber a magia da água você deve nadar no lago sagrado. Ninguém nunca deixou de nadar nesse lago após a benção da magia!");
                //System.out.println("Você deseja ir nadar ?");
               // System.out.println("- Sim");
               // System.out.println("- Não");
                String nadar = input.next();
                if(nadar.equalsIgnoreCase("Sim")) {
                    System.out.println("Ótimo, você acabou se fortalecendo ainda mais e seu pet acabou de evoluir para um Tubarão que tem consciência e consegue se comunicar com humanos");
                    perso.deltaStamina(+ 20);
                    System.out.println("OBS: Ele deseja ser chamado de Tutubarão agora...");
                    System.out.println("Vocês foram convocados pelo rei para tentar lidar com um monstro que tem matado muitos camponeses recentemente");
                    System.out.println("Você deseja ir até o rei?");
                    System.out.println("- Ir");
                    System.out.println("- Ficar ");
                    String ida = input.next();
                    if(ida.equalsIgnoreCase("Ir")) {
                        System.out.println("Era uma armadilha, o rei não gosta de bruxos e nunca gostou. Você acabou morrendo envenenado com um copo de vinho ! A sua jornada acaba aqui ");
                        perso.deltaStamina(- 100);
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
    } } else {
        System.out.println("Olá Bilirinho,me chamo Geralt e você acaba de se juntar a sociedade dos bruxos,mas antes você precisará escolher em qual tipo de magia se especializar");
        System.out.println("Só existem 2 tipos de magia: Fogo e Água");
        ;
        System.out.println("Sim, eu sei que você deve estar confuso, mas resumindo, você morreu e reencarnou aqui :) ");
        System.out.println("Então, qual o tipo de magia você escolhe?");
        System.out.println("- Fogo");
        System.out.println("- Água");
        String magia = input.next();

        if(magia.equalsIgnoreCase("Fogo")){
            System.out.println("Hm, uma magia deveras interessante mas um pouco complexa de se usar");
            System.out.println("Deseja continuar mesmo assim?");
            String escolha = input.next();
            if(escolha.equalsIgnoreCase("Sim")){
               System.out.println("Parabéns, Bilirinho  você agora possui a magia de fogo, começe a treinar o quanto antes para subir de nível !");
               System.out.println("Você prefere ir upar contra monstros ou ficar no castelo ?"); 
               System.out.println("- Upar");
               System.out.println("- Castelo");
                String lugar  = input.next();
               
                if(lugar.equalsIgnoreCase("Upar")) {
                    System.out.println("Você foi upar, acabou encontrando um boss e acabou morrendo. Sua jornada acaba aqui :) ");
                    perso2.deltaStamina(-100);
                }
                else if (lugar.equalsIgnoreCase("Castelo")) {
                    System.out.println("Boa escolha, você não podia sair pois estava sem armadura, quase ia me esqueçendo !");
                    perso2.deltaStamina(+50);
                    
                    System.out.println("Agora, diga-me, você gostaria de beber um gole desta poção que deixaria você mais forte ?");
                    String pot = input.next();
                    if(pot.equalsIgnoreCase("Sim")) {
                        System.out.println("Você não resistiu aos efeitos colaterais da poção e morreu ali mesmo. Sua jornada acaba aqui !");
                        perso2.deltaStamina(-100);;

                    } else {
                        System.out.println("Ainda bem, você não iria resistir aos efeitos mesmo :) ");
                        perso2.deltaStamina(+10);
                       /*  System.out.println("......... Mutildão gritando fora do castelo");
                        System.out.println("O rei se revoltou contra os bruxos por conta de uma garrafa de cerveja e mandou matarem todos os bruxos");
                        System.out.println("Corra, Eu e os bruxos anciões tentaremos segurar o máximo possível. Disse Geralt.");
                        System.out.println("O que você irá fazer ? Correr ou Ficar");
                        String fuga = input.next();
                        if(fuga.equalsIgnoreCase("Correr")) {
                            System.out.println("Você tentou tentou fugir pelos fundos do castelo mas acabou tropeçando na escada e quebrou o pescoço na queda! Sua jornada acaba aqui ! ");
                            System.out.println("Bilirinho Morreu !");
                        } else {
                            System.out.println("Você ficou para lutar e ajudar os outros, mas sua falta de experiência em batalha lhe custou a vida e você morreu depois de levar uma pedrada na cabeça ! Sua jornada acaba aqui !");
                            System.out.println("Bilirinho Morreu !");
                        } */
                }                           
                } 

                }
         
            else{
                System.out.println("Ah, que pena! Tente escolher outra depois de se apresentar novamente :) ");
            
            }

        }/*else {
            System.out.println("Hm, uma magia que você poderá utilizar facilmente, porém, dependendo do oponente ela não terá a menor eficácia deseja mesmo assim?");
            System.out.println("Deseja continuar mesmo assim ? ");  
            String escolha1 = input.next();
            if(escolha1.equalsIgnoreCase("Sim")) {
                System.out.println("Meus parabéns, você agora possui a magia da água e com ela veio junto este pequeno golfinho para ser seu pet");
                System.out.println("Agora, existe um ritual que após receber a magia da água você deve nadar no lago sagrado. Ninguém nunca deixou de nadar nesse lago após a benção da magia!");
                System.out.println("Você deseja ir nadar ?");
                System.out.println("- Sim");
                System.out.println("- Não");
                String nadar = input.next();
                if(nadar.equalsIgnoreCase("Sim")) {
                    System.out.println("Ótimo, você acabou se fortalecendo ainda mais e seu pet acabou de evoluir para um Tubarão que tem consciência e consegue se comunicar com humanos");
                    System.out.println("OBS: Ele deseja ser chamado de Tutubarão agora...");
                    perso2.deltaStamina(+ 10 );
                    System.out.println("Vocês foram convocados pelo rei para tentar lidar com um monstro que tem matado muitos camponeses recentemente");
                    System.out.println("Você deseja ir até o rei?");
                    System.out.println("- Sim");
                    System.out.println("- Não");
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
            }*/
    } }
    }


