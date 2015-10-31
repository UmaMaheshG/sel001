/**
 * Created by PRANAV on 10/18/2015.
 */
public class Reverse2
{

    public void reversemethod(String a)
    {

        String reverse="";
        for(int i=a.length()-1;i>=0;i--) {

            reverse = reverse + a.charAt(i);
            System.out.print(a.charAt(i));
        }
    }

    public static void main(String args[])
    {
        Reverse2 rev=new Reverse2();
        String str="tester";
        rev.reversemethod(str);

    }

}

