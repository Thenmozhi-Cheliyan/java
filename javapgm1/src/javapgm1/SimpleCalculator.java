package javapgm1;
import java.util.*;
public class SimpleCalculator 
{

	public static void main(String[] args)
	{
		
		long num1,num2,add,sub,mul,div,mod;
		int exp;
		Scanner scan=new Scanner(System.in);
		System.out.println("NUMBER 1 = ");
		num1=scan.nextInt();
		System.out.println("NUMBER 2 = ");
		num2=scan.nextInt();
		System.out.println("*************************");
		System.out.println("       OPTIONS           ");
		System.out.println("*************************");
		System.out.println("   (1) ADDITION  ");
		System.out.println("   (2) SUBTRACTION");
		System.out.println("   (3) MULTIPLICATION");
		System.out.println("   (4) DIVISION");
		System.out.println("   (5) MODULUS");
		System.out.println("___________________________");
		System.out.println("Your Option ");
		exp=scan.nextInt();
		scan.close();
		switch(exp)
		{
		case 1:
			add=num1+num2;
			System.out.println(num1+"+"+num2+" = "+add);
			break;
		case 2:
			sub=num1-num2;
			System.out.println(num1+"-"+num2+" = "+sub);
			break;
		case 3:
			mul=num1*num2;
			System.out.println(num1+"*"+num2+" = "+mul);
			break;
		case 4:
			div=num1/num2;
			System.out.println(num1+"/"+num2+" = "+div);
			break;
		case 5:
			mod=num1%num2;
			System.out.println(num1+"%"+num2+" = "+mod);
			break;
		 default:
			System.out.println("INVALID OPTION");
			break;
		}		
	}
}
