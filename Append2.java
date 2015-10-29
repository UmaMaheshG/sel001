public class Append2
{
	public static void main(String[] args)
	{
		String s = "Selenium";
		String p = "Training";
		int i;
		String dots=".";
		for(i=0;i<=2;i++)
		{
		   dots=dots+".";
		}

		String disp = s + dots + p ;
		System.out.println(disp);
	}
}
