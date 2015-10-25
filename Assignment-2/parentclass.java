package com.salesforce.qa;

/**
 * Created by SASHIDHAR on 10/25/2015.
 */
public class parentclass {

    public void add(int a, int b){

        int c = a+b;
        System.out.println("Addition of a and b :"+c);

    }

    private void sub(int a,int b){

        int c= a-b;
        System.out.println("Subtraction of a and b:"+c);
    }

    void mul(int a, int b){

        int c = a*b;
        System.out.println("Multiplication of a and b:"+c);
    }
    protected void div (int a, int b){

        int c = a/b;
        System.out.println("Division of a and b:"+c);
    }

    public static void main(String args[]){

        parentclass p = new parentclass();
        p.sub(100,200);

    }
}
