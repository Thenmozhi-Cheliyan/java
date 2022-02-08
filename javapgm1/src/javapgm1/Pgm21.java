package javapgm1;

public class Pgm21
{

	public static void main(String[] args)
	{
	
		int a=10,b=20;
		System.out.println("++a-b-- = "+(++a-b--));
		System.out.println("a%b++ = "+(a%b++));//a=11,b=20 increments first because of priority
		System.out.println("a*=b+5 = "+(a*=b+5));
		int x=69>>2;
		System.out.println("x = "+x);
	}

}
