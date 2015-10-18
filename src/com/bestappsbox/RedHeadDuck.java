package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNormal();
    }

    @Override
    public void display() {
        System.out.println("I'm Red head duck.");
    }
}
