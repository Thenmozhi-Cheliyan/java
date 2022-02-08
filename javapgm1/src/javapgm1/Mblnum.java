package javapgm1;
import java.util.*;

public class Mblnum 
{
	public static void main(String[] args) 
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the mobile number:");
		long mblno=y.nextLong();
		System.out.println("FEEL FREE TO CONTACT ON ");
		System.out.println("+91 "+mblno);
		y.close();
	}

}
