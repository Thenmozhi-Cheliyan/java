package javapgm1;
import java.util.*;
public class UnitConvertion
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int km,cm,centigrade,gms,kg;
		double farenheit,mt,miles,squareFeet;
		double acre;
		int exp;
		System.out.println("*****************OPTIONS*************************");
		System.out.println("  1 --> KILOMETER TO MILES");
		System.out.println("  2 --> CENTIGRADE TO FARENHEIT");
		System.out.println("  3 --> SQUARE FEET TO ACRE");
		System.out.println("  4 --> CENTIMETER TO METER");
		System.out.println("  5 --> GRAMS TO KILOGRAMS");
		System.out.println("**************************************************");
		System.out.println("YOUR CHOICE ");
		exp=sc.nextInt();
		
		switch(exp)
		{
		case 1:
			System.out.println("KILOMETER TO METER");
			System.out.print("KILOMETER = ");
			km=sc.nextInt();
			miles=km*0.62;
			System.out.println(km+"km ="+miles+"miles");
			break;
		case 2:
			System.out.println("CENTIGRADE TO FARENHEIT");
			System.out.print("CENTIGRADE = ");
			centigrade=sc.nextInt();
			farenheit=(centigrade*1.8)+32;
			System.out.println(centigrade+"celcius = "+farenheit+"F");
			break;
		case 3:
			System.out.println("SQUARE FEET TO ACRE");
			System.out.print("SQUARE FEET = ");
			squareFeet=sc.nextDouble();
			acre=squareFeet/43560;
			System.out.println(squareFeet+"sqft = "+acre+"acre");
			break;
		case 4:
			System.out.println("CENTIMETER TO METER");
			System.out.print("CENTIMETER = ");
			cm=sc.nextInt();
			mt=cm*0.01;
			System.out.println(cm+"cm = "+mt+"mt");
			break;
		case 5:
			System.out.println("GRAMS TO KILOGRAMS");
			System.out.print("KILOGRAMS = ");
			kg=sc.nextInt();
			gms=kg*1000;
			System.out.println(kg+"kg = "+gms+"gms");
			break;
		default:
			System.out.println("INVALID OPTION");
			break;
			
		}
	sc.close();

	}

}
