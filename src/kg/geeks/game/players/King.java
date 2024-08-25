package kg.geeks.game.players;
import java.util.Random;

public class King extends Hero {
     public King(String name, int health, int damage){
         super(name,health,damage, SuperAbility.SAITAMA_SHI);
         this.setDamage(0);
     }
     @Override
     public void setDamage(int damage){

     }


    public void applySuperPower(Boss boss, Hero[] heroes) {
         Random rand = new Random();
        if (rand.nextInt(1,11) ==1 ) {
            System.out.println("Saitama Arrives!");
            boss.setHealth(0);
        }
    }
}
