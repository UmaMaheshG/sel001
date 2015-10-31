/**
 * Created by PRANAV on 10/18/2015.
 */
public class Greatest {

    public void grtm(int[] n)
    {
        int maxnumber=0;
        for(int i=0;i<n.length;i++)
        {
            //min1=n[i];
            if(n[i]>maxnumber)
                maxnumber=n[i];
        }
        System.out.println(maxnumber);
       // System

    }
    public static void main(String args[])
    {
        Greatest grt1=new Greatest();
        int[] n=new int[]{1,2,3,5,2,4,5,6};
        grt1.grtm(n);

    }
}
