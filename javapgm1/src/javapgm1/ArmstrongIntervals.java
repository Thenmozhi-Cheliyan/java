package javapgm1;
import java.util.*;
public class ArmstrongIntervals 
{
	public static void main(String args[])
	{
		int low,high;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Lower Bound = ");
		low=s.nextInt();
		System.out.println("Higher Bound = ");
		high=s.nextInt();
		System.out.println("Armstrong number between "+low+" & "+high);
		s.close();
		for(int i=low;i<=high;i++)
		{
			int digits=0;
			int result=0;
			int originalNumber=i;
			
			while(originalNumber!=0)
			{
				 originalNumber/=10;
				 digits++;	
			}
			originalNumber=i;
			
			while(originalNumber!=0)
			{
				int remainder=originalNumber%10;
				result=(int) (result+Math.pow(remainder, digits));
				originalNumber/=10;
			}
			
			if(result==i)
				System.out.print(i+" ");
		}	
		
	}
}
