package StrategyPattern;

public class Pegasus extends Character {
    public Pegasus(MoveBehavior moveBehavior,
                   SuperPowerBehavior superPowerBehavior) {
        super(moveBehavior, superPowerBehavior);
    }

    public void displayCharacterType() {
        System.out.println("I am a pegasus");
    }
}
