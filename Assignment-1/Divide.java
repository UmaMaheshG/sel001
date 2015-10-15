/**
 * Created by user on 10/7/15.
 */
public class Divide {
        int a;
        int b;
        int div;
    public int division()
    {
        int div = a/b;
        return div;
    }
    public static void main (String args[])
    {
        Divide div1 = new Divide();
        div1.a = 2;
        div1.b = 0;
        div1.division();
        System.out.println("Output:"+div1.division());

    }
}

