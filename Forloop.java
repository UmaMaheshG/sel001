/**
 * Created by PRANAV on 10/10/2015.
 */
public class Forloop {

   //int [] a;
   public void form(int []a)
    {
       for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {

        int [] a= new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("print"+a.length);

        Forloop f=new Forloop();
        f.form(a);
    }
}
