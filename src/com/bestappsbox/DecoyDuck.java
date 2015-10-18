package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class DecoyDuck extends Duck{

    public DecoyDuck(){
        quackBehavior = new NoQuack();
        flyBehavior = new NoFly();
    }
    @Override
    public void display() {
        System.out.println("I'm Decoy duck");
    }

}
