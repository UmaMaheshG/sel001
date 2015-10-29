package com.salesforce.qa.utils;
import java.io.File;
import java.io.File.*;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by saraswathi on 10/27/2015.
 */
public class Readconfigproperties {

    public static void main(String args[]){
        Properties con = new Properties();

        try{
            File f = new File("C:\\Users\\saraswathi\\IdeaProjects\\Seleniumpractice\\src\\com\\salesforce\\qa\\utils\\Config.properties");
        FileInputStream fin = new FileInputStream(f);
            con.load(fin);
            System.out.println(con.getProperty("Browser"));

        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }
        }
}
