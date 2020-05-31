package StrategyPattern;

public class SuperPunch implements SuperPowerBehavior {

    @Override
    public void superPower() {
        System.out.println("This is my super punch");
    }
}
