package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNormal();
    }

    @Override
    public void display() {
        System.out.println("I'm Mallard duck");
    }
}
