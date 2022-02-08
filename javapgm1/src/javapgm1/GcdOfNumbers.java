package javapgm1;
import java.util.*;
public class GcdOfNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,no1,no2,gcd=1;
System.out.println("Enter two numbers:");
no1=s.nextInt();
no2=s.nextInt();

s.close();

for(i=1;(i<=no1)&&(i<=no2);i++)
{
	if((no1%i==0)&&(no2%i==0))
	
	gcd=i;		
}
System.out.println("The GCD of two numbers "+no1+" and "+no2+" is "+gcd);
	}
}
