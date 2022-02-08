package javapgm1;
import java.io.*;
public class Fact
{

	public static void main(String[] args)throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		int n,fac=1;
		System.out.println("Enter n:");
		n=Integer.parseInt(d.readLine());
		for(int i=n;i>=1;i--)
		{
			fac=fac*i;	
		}
		System.out.println("The factorial of "+n+" is "+fac);
	}
}
