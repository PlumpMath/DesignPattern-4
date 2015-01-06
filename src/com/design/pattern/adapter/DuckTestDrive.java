
package com.design.pattern.adapter;



public class DuckTestDrive {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck fakeDuck = new TurckyAdapter(turkey); 

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        System.out.println("\nThe fake Duck says...");
        testDuck(fakeDuck);
        
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}