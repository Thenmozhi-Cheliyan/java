package javapgm1;
import java.util.*;
public class PrimeIntervals 
{
	public static void main(String args[])
	{
		
		int i,j,low,high,count;
		Scanner s=new Scanner(System.in);
		System.out.println("LOWER BOUND = ");
		low=s.nextInt();
		System.out.println("UPPER BOUND = ");
		high=s.nextInt();
		System.out.println("Prime numbers between "+low+" and "+high);
		for(i=low;i<=high;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count=count+1;
					
			}
			if(count==2)
				System.out.println(i);
		}
	}
}
