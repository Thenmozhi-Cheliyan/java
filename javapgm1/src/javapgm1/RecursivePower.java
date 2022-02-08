package javapgm1;
import java.util.*;
public class RecursivePower 
{
	public static int power(int base,int exponent)
	{
	if(exponent!=0)
		return(base*power(base,exponent-1));
	else
		return 1;
	}
	public static void main(String args[])
	{
		int base,exponent,result;
		Scanner s=new Scanner(System.in);
		System.out.println("BASE = ");
		base=s.nextInt();
		System.out.println("EXPONENT = ");
		exponent=s.nextInt();
		result=power(base,exponent);
		System.out.println(base+"^"+exponent+"="+result);
		s.close();
	}

}
