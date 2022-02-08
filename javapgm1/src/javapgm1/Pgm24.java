package javapgm1;
import java.util.*;
public class Pgm24
{

	public static void main(String[] args) 
	{
	
		int y,z;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter y value:");
		y=t.nextInt();
		if(y==10)
		{
		z=++y *(y++ + 5);
		System.out.println("++y *(y++ + 5) --> "+z);
		}
		else
			System.out.println("Invalid number");
		
		t.close();
	}

}
