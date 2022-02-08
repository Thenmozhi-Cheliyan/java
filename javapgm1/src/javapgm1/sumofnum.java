package javapgm1;
import java.util.*;
public class sumofnum
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n,i,sum;
	sum=0;
	i=1;
	System.out.println("Enter n:");
	n=s.nextInt();
	s.close();
	while(i<=n)
	{
	sum=sum+i;
	i++;
	}
	System.out.println("The Sum of "+n+" natural numbers is "+sum);
	}
}
