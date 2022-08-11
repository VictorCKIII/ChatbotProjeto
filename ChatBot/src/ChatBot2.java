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
        
        String[] escolhasCap1 = new String[2];
        escolhasCap1[0] = "Fogo";
        escolhasCap1[1] = "Água";
        
       if(escolhap == 1) {
       
        Capitulo cap1 = new Capitulo("Escolhendo suas Magias",
         "Neste mundo possuímos 2 tipos de magias: Fogo e Água! Escolha entre Fogo e Água  ",
         escolhasCap1,
           perso,
            100,
            input);
            cap1.escolhendo();
            cap1.mostrar();
        String magia = input.next();
        String[] escolhasCap2 = new String[2];
        escolhasCap2[0] = "Upar";
        escolhasCap2[1] = "Castelo";
        if(magia.equalsIgnoreCase("Fogo")){
            System.out.println("Hm, uma magia deveras interessante mas um pouco complexa de se usar");
            System.out.println("Deseja continuar mesmo assim?");
            String escolha = input.next();       
         if(escolha.equalsIgnoreCase("Sim")){
                Capitulo cap2 = new Capitulo("PRIMEIRA ESCOLHA ",
                 "VOCÊ POSSUI A MAGIA DE FOGO! Agora, escolha entre Upar e Castelo",
                  escolhasCap2,
                    perso,
                     50,
                     input);
                cap2.escolhendo();
                cap2.mostrar();
                
                String lugar  = input.next();
                String[] escolhascap3 = new String[2];
                escolhascap3[0] = "Sim";
                escolhascap3[1] = "Não";
                if(lugar.equalsIgnoreCase("Upar")) {
                    System.out.println("Você foi upar, acabou encontrando um boss e acabou morrendo. Sua jornada acaba aqui :) ");
                    perso.deltaStamina(-100);
                }
                else if (lugar.equalsIgnoreCase("Castelo")) {
                    System.out.println("Boa escolha, você não podia sair pois estava sem armadura, quase ia me esqueçendo !");
                    perso.deltaStamina(+50);
                    Capitulo cap3 = new Capitulo("BEBENDO POÇÃO",
                     "VOCÊ ESTÁ PRESTES A BEBER A POÇÃO!",
                      escolhascap3,
                       perso,
                       0,
                       input);
                    cap3.mostrar(); 
                    cap3.escolhendo();
                    String pot = input.next();
                    if(pot.equalsIgnoreCase("Sim")) {
                        System.out.println("Você não resistiu aos efeitos colaterais da poção e morreu ali mesmo. Sua jornada acaba aqui !");
                        perso.deltaStamina(- 100);

                    } else {
                        System.out.println("Ainda bem, você não iria resistir aos efeitos mesmo :) ");
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
            String[] escolhacap4 = new String[2];
            escolhacap4[0] = "Sim";
            escolhacap4[1] = "Não";
            if(escolha1.equalsIgnoreCase("Sim")) {
                Capitulo cap5 = new Capitulo("CAPÍTULO 5",
                 "RITUAL DA ÁGUA",
                  escolhacap4,
                    perso,
                     -50,
                     input);

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
                                          {
    
                        } else {
                          
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