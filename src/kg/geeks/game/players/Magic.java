package kg.geeks.game.players;


import java.util.Random;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }
     final int boostBaseValue = 1;
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth()>0){
                Random BoostModifier =new Random();

                hero.setDamage(hero.getDamage()+(boostBaseValue * (BoostModifier.nextInt(1,6))));
            }

        }

    }
}
