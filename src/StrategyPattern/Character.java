package StrategyPattern;

abstract class Character {
    MoveBehavior moveBehavior;
    SuperPowerBehavior superPowerBehavior;

    public Character(MoveBehavior moveBehavior,
                     SuperPowerBehavior superPowerBehavior) {
        this.moveBehavior = moveBehavior;
        this.superPowerBehavior =superPowerBehavior;
    }

    public void attack() {
        System.out.println("I am using default attack");
    }

    public void move() {
        moveBehavior.move();
    }

    public void superPower() {
        superPowerBehavior.superPower();
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setSuperPowerBehavior(SuperPowerBehavior superPowerBehavior) {
        this.superPowerBehavior = superPowerBehavior;
    }

    public abstract void displayCharacterType();
}
