package com.company;

public class Main {

    public static void main(String[] args) {

        Main me = new Main();
        me.doIt();
    }

    public void doIt(){
        System.out.println("WELCOME TO 'QUEUE IT' !!!");

        AQueue q = new AQueue();

        q.add("String 1");
        q.add("String 2");
        q.add("String 3");

        System.out.println(q);

        System.out.println("Removing " + q.remove());

        System.out.println(q);
    }
}
