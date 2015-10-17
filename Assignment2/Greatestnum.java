/**
 * Created by RAGHU on 10/15/2015.
 */
public class Greatestnum {

    public void method(int a[])
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];

            }

        }
        System.out.println(max);
    }
    public static void main(String args[])
    {
        Greatestnum g1= new Greatestnum();
        int a[]= new int[]{1,2,3,5,2,4,6};
        g1.method(a);
    }
}
