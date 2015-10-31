/**
 * Created by PRANAV on 10/24/2015.
 */
public class Superkeywordbase extends Superkeywordparent
{
    public void display()
    {
        int super1=500;
        System.out.println("prints variable value from base class  "+ super1);//print this clas value
        add();//print this clas value
        System.out.println("prints variable value parent class   "+ super.super1);//print parent clas value
        super.add();//print parent clas value

    }

    public void add()
    {
        int a=100;
        int b=200;
        int c=a+b;
        System.out.println("sum from base class is   "+ c)  ;
    }

    public static void main(String args[])
  {
      Superkeywordbase key=new Superkeywordbase();
      key.display();
  }
}
