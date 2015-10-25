/**
 * Created by saraswathi on 10/13/2015.
 */
public class Primenumber {
    int count = 0;
    int a = 0;
    int flag = 0;
    public void sum() {

        for (int i = 2; count < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }

        if (flag == 0) {
            a = a + i;
            count++;
        }
            flag=0;
    }
       System.out.println(a);
    }
    public static void main(String args[]){

        Primenumber p = new Primenumber();
       p.sum();

    }
}
