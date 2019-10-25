import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sample 
{
	public static void main(String args[]) 
	{
		int num, denom;
		num=5;
		try 
		{
			denom=num/0;			
		}
		catch(Exception e) 
        {
			System.out.println("cannot divide by zero  " +e);
		}
		try
		{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			int x = Integer.parseInt(buf.readLine());
		}
		catch(Exception e) 
        {
			System.out.println("anotherReader  ");
		}
		try
		{
			int c[] = { 1 };
		    c[42] = 99;
		}
		catch(Exception e) 
        {
			System.out.println("task1 is completed  ");
		}
	}
}

