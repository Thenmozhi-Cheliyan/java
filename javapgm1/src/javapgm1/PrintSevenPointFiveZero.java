package javapgm1;
import java.text.DecimalFormat;
public class PrintSevenPointFiveZero 
	{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num1=3;
		float num2=0.500198f;
		float result;
		num1*=2;
		++num1;
		result=num1+num2;
		DecimalFormat df=new DecimalFormat();
		df.setMinimumFractionDigits(2);
		System.out.println("Printed successfully...........");
		System.out.println(df.format(result));
		System.out.println("...............................");
	}
}
