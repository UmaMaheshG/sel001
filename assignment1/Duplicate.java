/**
 * Created by PRANAV on 10/18/2015.
 */
public class Duplicate
{

    public void duplicatem(int []d)
    {
        for(int i=0;i<d.length;i++)
        {
            //System.out.print(d[i]);
            for(int j=1;j<i;j++)
            {
                if(d[i]==d[j]&&i!=j)
                    System.out.println("Duplicate number is  "+d[i]);
            }
        }
       // System.out.print(d[i]);
    }

    public static void main(String args[])
    {
        Duplicate dp=new Duplicate();
        int[] n=new int[]{1,2,3,5,2,4,5,6};
        dp.duplicatem(n);

    }
}
