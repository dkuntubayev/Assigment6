package StrategyPattern;

public class MagicAttack implements SuperPowerBehavior {

    @Override
    public void superPower() {
        System.out.println("I am using magic to attack");
    }
}
