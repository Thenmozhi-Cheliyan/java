package javapgm1;
import java.util.*;
public class AsciiValue 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char ch;
		int characterValue;
		System.out.println("Enter the character:");
		ch=s.next().charAt(0);
		characterValue=ch;
		System.out.println("The ASCII value of "+ch+" is "+characterValue);
		s.close();
		}

}
