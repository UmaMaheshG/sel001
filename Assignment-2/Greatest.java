/**
 * Created by user on 10/12/15.
 */
public class Greatest {

    public void great(int [] a){
        int largest = a[0];

        for(int i=0;i<a.length;i++){

            if(a[i]>largest){
                 largest = a[i];
            }

        }
        System.out.println(largest);
    }

    public static void main(String args[]){
        int[] a = new int[] {1,2,3,2,4,6};

        Greatest g = new Greatest();
        g.great(a);

    }
}
