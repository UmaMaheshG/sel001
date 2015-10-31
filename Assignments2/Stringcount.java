/**
 * Created by PRANAV on 10/18/2015.
 */

//Display count and each character
public class Stringcount {
    public void strcntmethod(String a)
    {
         System.out.println("The characters are  ");
        for(int i=0;i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
    }

    public static void main(String []args)
    {

        Stringcount str=new Stringcount();
        String str1="Qshellabs training";
        System.out.println("String count is    " + str1.length());
        str.strcntmethod(str1);

    }

}
