/**
 * Created by saraswathi on 10/14/2015.
 */
public class Loops {
    int a[] = {1,2,3,4,5,6};

    public void ifloop(){

        if(a.length ==6)
        {
            System.out.println("Success");
        }
        else{
            System.out.println("Falied");
        }
    }
    public void forloop(){

        for(int i =0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
   public void whileloop(int i) {

       while (i < 4) {
           System.out.println(a[i]);
           i++;
           }
       }

    public void switchcase(){

        for(int i =0;i<3;i++) {

            switch (i) {

                case 0: System.out.println(1);
                         break;
                case 1: System.out.println(2);
                       break;
                case 2: System.out.println(3);
                       break;
                case 3: System.out.println(4);
                      break;
                case 4: System.out.println(5);
                      break;
                case 5: System.out.println(6);
                      break;

            }
        }
    }
    public static void main(String args[]){

        Loops p = new Loops();
        p.ifloop();
        p.forloop();
        p.whileloop(1);
        p.switchcase();
    }
}
