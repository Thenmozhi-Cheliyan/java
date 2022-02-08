package javapgm1;
import java.util.*;
public class ConcentricCircle 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float outerRadius,innerRadius,outerArea,innerArea,area;
		final float pie=3.14f;
		
		System.out.print(" Radius of Outer Circle =  ");
		outerRadius=s.nextInt();

		System.out.print(" Radius of Inner Circle = ");
		innerRadius=s.nextInt();
		
		outerArea=2*pie*outerRadius*outerRadius;
		innerArea=2*pie*innerRadius*innerRadius;
		
		area=outerArea-innerArea;
		System.out.print("The area between two concentric circles is "+area);
		
		s.close();
	}
}
