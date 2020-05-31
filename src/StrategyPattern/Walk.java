package StrategyPattern;

public class Walk implements MoveBehavior {

    @Override
    public void move() {
        System.out.println("I am walking now");
    }
}
