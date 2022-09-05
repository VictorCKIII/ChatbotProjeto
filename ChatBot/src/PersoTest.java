
public class PersoTest {
    public String nome; 
    public int stamina ;

    PersoTest(String nome  , int stamina) 
    {
        this.nome = nome;
        this.stamina = stamina;
    }

    void deltaStamina(int varstamina)
    {
        this.stamina = this.stamina + varstamina;
        
        if(varstamina > 0)
        {
            System.out.println("..." + this.nome + " Ganhou " + varstamina + " Pontos de Stamina");
        }
        else 
        {
            System.out.println("..." + this.nome + " Perdeu" + varstamina + " Pontos de Stamina");
        }
        if(this.stamina > 100){
            this.stamina = 100;
        }
        else if(this.stamina < 0){
            this.stamina = 0 ;
            System.out.println(this.nome);
        }
    }
    }
    

