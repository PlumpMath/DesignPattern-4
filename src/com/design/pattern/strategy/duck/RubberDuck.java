
package com.design.pattern.strategy.duck;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }

    @Override
    public void quack() {
        System.out.println("Squeak,Squeak~");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void swim() {
        System.out.println("float");
    }
}