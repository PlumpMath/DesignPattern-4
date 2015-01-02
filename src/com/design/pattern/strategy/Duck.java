
package com.design.pattern.strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("quack,quack!");
    }

    public void fly() {
        System.out.println("fly");
    }

    public abstract void display();

    public void swin() {
        System.out.println("swin");
    }
}
