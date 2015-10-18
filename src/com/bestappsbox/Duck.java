package com.bestappsbox;

/**
 * Created by cuonghv on 10/15/15.
 */
public abstract class Duck {
   protected QuackBehavior quackBehavior;
   protected FlyBehavior flyBehavior;

   public abstract void display();

   public void swim(){
      System.out.println("I'm swimming.");
   }

   public void performFlying(){
      flyBehavior.fly();
   }

   public void performQuacking(){
      quackBehavior.quack();
   }

   public void setFlyBehavior(FlyBehavior flyBehavior){
      this.flyBehavior = flyBehavior;
   }

   public void setQuackBehavior(QuackBehavior quackBehavior) {
      this.quackBehavior = quackBehavior;
   }
}
