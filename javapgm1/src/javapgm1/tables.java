package javapgm1;
import java.util.*;
public class tables 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i,mul;
		System.out.println("Enter the table number:");
		n=s.nextInt();
		s.close();
		for(i=1;i<=10;i++)
		{
			mul=i*n;
			System.out.println(n+"*"+i+"="+mul);
			
		}
	}
}
