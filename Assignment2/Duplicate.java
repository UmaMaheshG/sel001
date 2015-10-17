/**
 * Created by RAGHU on 10/15/2015.
 */
public class Duplicate {

    public void dup(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
           for (int j=i+1; j<a.length;j++)
           {
               if(a[i]==a[j])
               {
                   System.out.println("Duplicate number is" +a[i]);
               }
           }
        }
    }
    public static void main(String args[])
    {
        Duplicate d1= new Duplicate();
        int a[]= new int[]{1,2,3,5,2,4,6};
        d1.dup(a);

    }
}
