package publicp;


/**
 * Created by PRANAV on 10/24/2015.
 */
public class Privateclasss extends Defaultclass
{


      private void display2()
      {

          System.out.println("private method");
      }

    public static void main(String []args)
    {
        Privateclasss p=new Privateclasss();
        p.display1();
        p.display3();
        p.display2();
        p.display4();
    }

}
