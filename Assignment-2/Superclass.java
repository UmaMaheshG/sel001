package com.salesforce.qa;

/**
 * Created by SASHIDHAR on 10/25/2015.
 */
public class Superclass extends parentclass {

    public void dis(){

        super.mul(10,7);
        super.add(200,400);
        super.div(100,3);

        System.out.println("Success");
    }

    public static void main(String args[]){

        Superclass s = new Superclass();
        s.dis();
    }
}
