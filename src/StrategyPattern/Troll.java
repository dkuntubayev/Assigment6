package StrategyPattern;

public class Troll extends Character {
    public Troll(MoveBehavior moveBehavior,
                 SuperPowerBehavior superPowerBehavior) {
        super(moveBehavior, superPowerBehavior);
    }

    public void displayCharacterType() {
        System.out.println("I am a troll");
    }
}
