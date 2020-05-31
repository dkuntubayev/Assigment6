package StrategyPattern;

public class Elf extends Character {
    public Elf(MoveBehavior moveBehavior,
               SuperPowerBehavior superPowerBehavior) {
        super(moveBehavior, superPowerBehavior);
    }

    public void displayCharacterType() {
        System.out.println("I am an elf");
    }
}
