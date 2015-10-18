package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack! quack!");
    }
}
