package javapgm1;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// Armstrong Number
		Scanner s=new Scanner(System.in);
		int number,t,temp,remainder,sum=0;
		int count=0;
		System.out.print("Number = ");
		number=s.nextInt();
		s.close();
		
		t=number;
		temp=number;
		//Counting digits
		while(number!=0)
		{
			int digit=number%10;
			count=count+1;
			number=number/10;
			
		}
		//calculating
		while(t!=0)
		{
			remainder=t%10;
			sum=(int) (sum+Math.pow(remainder,count));
			t=t/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Its a armstrong number");
		}
		else
		{
			System.out.println("Its not a armstrong number");
		}
	}
}
