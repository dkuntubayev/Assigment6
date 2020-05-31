package StrategyPattern;

public class Vampire extends Character {
    public Vampire(MoveBehavior moveBehavior,
                   SuperPowerBehavior superPowerBehavior) {
        super(moveBehavior, superPowerBehavior);
    }

    public void displayCharacterType() {
        System.out.println("I am a vampire");
    }
}
