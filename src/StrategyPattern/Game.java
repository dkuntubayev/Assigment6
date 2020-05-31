package StrategyPattern;

public class Game {

    public static void main(String args[]) {
        MoveBehavior walk = new Walk();
        MoveBehavior fly = new Fly();

        SuperPowerBehavior magicAttack = new MagicAttack();
        SuperPowerBehavior magicFly = new MagicFly();
        SuperPowerBehavior superPunch = new SuperPunch();

        Character pegasus = new Pegasus(walk, magicFly);

        pegasus.displayCharacterType();
        pegasus.move();
        pegasus.attack();
        pegasus.superPower();
        pegasus.setMoveBehavior(fly);
        pegasus.setSuperPowerBehavior(magicAttack);
        pegasus.move();
        pegasus.superPower();
    }
}
