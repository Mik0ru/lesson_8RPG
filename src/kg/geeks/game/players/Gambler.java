package kg.geeks.game.players;

import java.util.Random;

public class Gambler extends Hero{
    public Gambler(String name,int health, int damage){
        super(name, health, damage, SuperAbility.ALL_IN);
    }
    Random roll1 = new Random();
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dice1 = roll1.nextInt(6) + 1;
        int dice2 = roll1.nextInt(6) + 1;
        if (dice1 == dice2) {
            System.out.println("Gambler deals damage to the boss");
            if (boss.getHealth() - (dice1 * dice2) <=0 ) {
                boss.setHealth(0);
            }
            else {
                boss.setHealth(boss.getHealth() - (dice1 * dice2));
            }
        }
        else {
            Hero hero = heroes[roll1.nextInt(heroes.length)];
            System.out.println(hero.getName() + " receives damage from gambler");
            if (hero.getHealth() - (dice1 + dice2) <=0 ) {
                hero.setHealth(0);
            }
            else {
                hero.setHealth(hero.getHealth() - (dice1 + dice2));
            }
        }

    }
}
