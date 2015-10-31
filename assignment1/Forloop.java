/**
 * Created by PRANAV on 10/10/2015.
 */
public class Forloop {

   public void form(int []n)
    {
       for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
  public void ifm()
  {

      int a=10;
      int b=20;
      if(a==b)
          System.out.println("false");
      else
          System.out.println("True");
  }
    public void whilem()
    {
        int i=1;
        while(i<5)
        {
            System.out.println("Print"+i);

            i++;
        }
    }

    public void switchm(int str)
    {
    String c="";
        switch(str)
        {
            case 1:
                c = "first";
                break;
            case 8:
                c = "last";
                break;
        }
        System.out.println("string is   " + c);
    }
       public static void main(String[] args)
       {
             int[] a= new int[]{1,2,3,4,5,6,7,8,9,10};
             Forloop f=new Forloop();
           System.out.print("Executing for loop  :");
             f.form(a);
           System.out.print("Executing if method : ");
             f.ifm();
           System.out.print("Executing while loop : ");
             f.whilem();
           System.out.print("Executing Switch statement : ");
             f.switchm(8);
       }
}
