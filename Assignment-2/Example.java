/**
 * Created by saraswathi on 10/14/2015.
 */
public class Example {
    
    public int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public static int sub(int a, int b){
        int c = a-b;
        return c;
    }
    public static void main(String args[]){
        Example ex = new Example();
        ex.sum(50,100);
        sub(200,400);
        System.out.println("sum of a & b is:"+ex.sum(50,100) );
        System.out.println("sum of a & b is:"+sub(200,400) );
    }
}


