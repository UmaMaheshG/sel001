package com.salesforce.qa.utils;

/**
 * Created by saraswathi on 10/27/2015.
 */
public class Interfacechild implements Interfaceparent,multiinterface {
    int a = 200;
    int b = 50;

    @Override
    public void add() {

        int c = a + b;
        System.out.println("Addition of a and b:" + c);

    }

    @Override
    public void sub() {
        int c = a - b;
        System.out.println("Subtraction of a and b:" + c);

    }

    @Override
    public void div() {
        int c = a / b;
        System.out.println("Division of a and b:" + c);

    }

    @Override
    public void mul() {
        int c = a * b;
        System.out.println("Multiplication of a and b:" + c);


    }


    @Override
    public void display() {

        System.out.println("Multiple Interfaces is possible");
    }

    @Override
    public void length() {

        String str = "TEST";
        System.out.println("Length of the string:" + str.length());
    }

    public static void main(String args[]) {

        Interfacechild ch = new Interfacechild();
        ch.add();
        ch.div();
        ch.sub();
        ch.mul();
        ch.display();
        ch.length();
    }
}
