/**
 * Created by saraswathi on 10/14/2015.
 */
public class Reversestring {
    String str1 = "";
    String str = "TESTER";

    public void reverse(){

        System.out.println(str.length());

        for(int i=str.length()-1;i>=0;i--){
            str1 = str1+str.charAt(i);

        }
        System.out.println("Reverse string:"+str1);
    }

    public static void main(String args[]){

        Reversestring st = new Reversestring();
        st.reverse();
    }
}
