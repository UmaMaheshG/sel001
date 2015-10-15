/**
 * Created by saraswathi on 10/13/2015.
 */
public class Duplicate {

    public void dup(){

        int[] a = new int[] {1,2,3,5,2,4,6};
        for( int i=0;i<a.length-1;i++){
            for( int j=0;j<a.length;j++){
                if((a[i]==a[j])&& (i!=j))
                {
                    System.out.println("Duplicate number is:"+a[i]);
                }
            }
        }
    }

    public static void main(String args[]){
        Duplicate d = new Duplicate();
        d.dup();
    }
}
