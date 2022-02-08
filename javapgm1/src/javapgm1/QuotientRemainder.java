package javapgm1;
import java.util.*;
public class QuotientRemainder 
{
	public static void main(String[] args) 
	{
		
    Scanner s=new Scanner(System.in);
    int no1,no2,quotient,remainder;
    
    System.out.println("Enter number 1:");
    no1=s.nextInt();
    System.out.println("Enter number 2:");
    no2=s.nextInt();
    quotient=no1/no2;
    remainder=no1%no2;
    System.out.println("QUOTIENT="+quotient);
    System.out.println("REMAINDER="+remainder);
    
    s.close();  
	}
}
