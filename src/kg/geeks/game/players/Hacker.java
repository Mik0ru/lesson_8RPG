package kg.geeks.game.players;

import java.util.Random;

public class Hacker extends Hero {

    private boolean AfterRound = true;

    public Hacker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.HACKER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        AfterRound = !AfterRound;
        if (AfterRound) {
            int ConfiscatedHealth = boss.getHealth() * (new Random().nextInt(9) + 1) / 100;
            boss.setHealth(boss.getHealth() - ConfiscatedHealth );
            Hero hero = heroes[new Random().nextInt(heroes.length)];
            hero.setHealth(hero.getHealth() + ConfiscatedHealth );
            System.out.println(this.getName() + " confiscated " +  ConfiscatedHealth+ " health and gave to " + hero.getName());
        }
    }

}
