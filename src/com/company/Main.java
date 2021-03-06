package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main me = new Main();
        me.doIt();
    }

    public void doIt(){
        System.out.println("WELCOME TO 'QUEUE IT' !!!");

        // ARRAY-BASED QUEUE
        AQueue q = new AQueue();

        q.add("String 1");
        q.add("String 2");
        q.add("String 3");

        System.out.println(q);

        System.out.println("Removing " + q.remove());

        System.out.println(q);

        // LINKED LIST BASED QUEUE
        LQueue l = new LQueue();

        l.add("String 1");
        l.add("String 2");
        l.add("String 3");

        System.out.println(l);

        System.out.println("Removing " + l.remove());

        System.out.println(l);
    }

    public void sim(){

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter simulation length in minutes -> ");

        int simulationLength = kbd.nextInt();
    }
}
