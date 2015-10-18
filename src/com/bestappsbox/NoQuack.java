package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I cannot quack!");
    }
}
