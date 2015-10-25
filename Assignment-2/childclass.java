package com.salesforce.qa;

/**
 * Created by SASHIDHAR on 10/25/2015.
 */
public class childclass extends parentclass{
    parentclass pa = new parentclass();

    public void dis(){
        pa.add(20,30);
        pa.div(50,2);
        pa.mul(10,5);
        System.out.println("Success");

    }

    public static void main(String args[]){

        childclass c = new childclass();
        c.dis();
    }
}
