/**
 * Created by saraswathi on 10/14/2015.
 */
public class Difference {

    public static void main(String args[]){

        // We need to create object inorder to call nonstatic method
        Example ex = new Example();
        ex.sum(100,200);
        // Using class name we can call static method
        Example.sub(150,100);
        System.out.println("sum of a & b is:"+ex.sum(100,200) );
        System.out.println("sum of a & b is:"+Example.sub(150, 100));

    }
}
