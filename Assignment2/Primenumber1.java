/**
 * Created by RAGHU on 10/16/2015.
 */
public class Primenumber1
{
        int count = 0;
        int number = 0;
        int flag = 0;
        public void primsum()
        {

            for (int i = 2; count < 1000; i++)
            {
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                        flag = 1;
                        break;
                    }

                }

                if (flag == 0)
                {
                    number = number + i;
                    count++;
                }
                flag=0;
            }
            System.out.println("Sume od 1st 1000 prime numbers is: " +number);
        }
        public static void main(String args[])
        {

            Primenumber1 pr1 = new Primenumber1();
            pr1.primsum();

        }
    }

