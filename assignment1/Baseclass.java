/**
 * Created by PRANAV on 10/24/2015.
 * Inheritence is using methods of a super class in base class with baseclassobject
 * Byusing extend keyword we can call super class methods in base class
 */
public class Baseclass extends Superclass{
    public static void main(String args[])
    {
        Baseclass bc=new Baseclass();
        System.out.println("Addition is   "+bc.add(2,3));
    }
}
