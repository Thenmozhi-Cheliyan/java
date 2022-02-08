package javapgm1;
import java.util.*;
public class ternaryop 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=s.nextInt();
		System.out.println((age>=18)?"Eligible to vote":"Not Eligible to vote");
	s.close();
	}
}
