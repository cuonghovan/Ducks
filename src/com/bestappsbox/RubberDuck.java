package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new Queack();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber duck.");
    }
}
