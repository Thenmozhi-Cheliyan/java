package javapgm1;
import java.util.*;
public class ReverseSentence 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed: ");
		String str=sc.nextLine();
		System.out.println("REVERSE STRING: ");
		reverse(str);
		sc.close();
	}
	
	public static void reverse(String str)
	{
		if((str==null||(str.length()<=1)))
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}

}
