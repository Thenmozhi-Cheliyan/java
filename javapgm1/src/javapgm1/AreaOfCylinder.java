package javapgm1;
import java.util.*;

public class AreaOfCylinder
{

	public static void main(String[] args)
	{
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) 
		{
			float radius,height,area;
			final float pie=3.14f;
			System.out.println("Enter radius:");
			radius=s.nextFloat();
			System.out.println("Enter height:");
			height=s.nextFloat();
			area=(2*pie*radius*height)+(2*pie*(radius*radius));
			System.out.println("The area of the cylinder = "+area);
		}
		
	}
}
