/**
 * Created by saraswathi on 10/13/2015.
 */
public class Display {
    String str = "Qshelllabs training";

    public void length( ){

        System.out.println("Length of the string:"+ str.length());

        for( int i = 0;i< str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        Display d = new Display();
        d.length();
    }
}
