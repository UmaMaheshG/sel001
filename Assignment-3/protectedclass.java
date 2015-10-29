package com.salesforce.qa.utils;
import com.salesforce.qa.*;

/**
 * Created by SASHIDHAR on 10/25/2015.
 */
public class protectedclass extends parentclass{

    public void dis(){

        super.add(20,40);
        super.div(20,5);
        System.out.println("Success");

    }

    public static void main(String args[]){

        protectedclass p = new protectedclass();
        p.dis();
    }
}
