package com.bestappsbox;

public class DuckMain{

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        testDuck(redHeadDuck);
        testDuck(mallardDuck);
        testDuck(rubberDuck);
        testDuck(decoyDuck);
        System.out.println("Changed Decoy duck's behaviors...");
        decoyDuck.setFlyBehavior(new FlyRocket());
        decoyDuck.setQuackBehavior(new Quack());
        testDuck(decoyDuck);
    }

    private static void testDuck(Duck duck){
        duck.display();
        duck.swim();
        duck.performQuacking();
        duck.performFlying();
    }
}
