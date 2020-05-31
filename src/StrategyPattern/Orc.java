package StrategyPattern;

public class Orc extends Character {
    public Orc(MoveBehavior moveBehavior,
               SuperPowerBehavior superPowerBehavior) {
        super(moveBehavior, superPowerBehavior);
    }

    public void displayCharacterType() {
        System.out.println("I am an orc");
    }


}
