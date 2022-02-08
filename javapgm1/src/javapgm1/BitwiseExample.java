package javapgm1;
import java.util.*;
public class BitwiseExample
{

	public static void main(String[] args)
	{
	
		int number1,number2,resultAND,resultOR,resultXOR,lShift,rShift,resultTilde;
	
		Scanner s=new Scanner(System.in);
		System.out.println("NUMBER1 = ");
		number1=s.nextInt();
		System.out.println("NUMBER2 = ");
		number2=s.nextInt();
		System.out.println("***********BITWISE AND*************");
		resultAND=number1&number2;
		System.out.println(+number1+" & "+number2+" = "+resultAND);
		
		System.out.println("***********BITWISE OR*************");
		resultOR=number1|number2;
		System.out.println(+number1+" | "+number2+" = "+resultOR);
	
		System.out.println("***********BITWISE XOR*************");
		resultXOR=number1^number2;
		System.out.println(+number1+" ^ "+number2+" = "+resultXOR);
		
		System.out.println("***********RIGHT SHIFT OPERATOR****");
		rShift=number1>>number2;
		System.out.println(+number1+" >> "+number2+" = "+rShift);
		
		System.out.println("***********LEFT SHIFT OPERATOR*****");
		lShift=number1<<number2;
		System.out.println(+number1+" << "+number2+" = "+lShift);
		
		System.out.println("***********TILDE*******************");
		resultTilde=~number1;
		System.out.println("~"+number1+" = "+resultTilde);
		
		s.close();
		
	}

}
