package StrategyPattern;

public class Fly implements MoveBehavior {

    @Override
    public void move() {
        System.out.println("I am flying now");
    }
}
