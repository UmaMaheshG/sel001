package com.salesforce.qa.utils;
import java.io.File;
import java.io.File.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by saraswathi on 10/27/2015.
 */
public class Writeinconfigproperties {
    public static void main(String args[]){
        Properties con = new Properties();

        try{
            File f = new File("C:\\Users\\saraswathi\\IdeaProjects\\Seleniumpractice\\src\\com\\salesforce\\qa\\utils\\Config.properties");
            FileOutputStream fot = new FileOutputStream(f);
            con.setProperty("name","test");
            con.store(fot,null);
            System.out.println(con.getProperty("name"));

        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}



