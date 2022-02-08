package javapgm1;

public class Pgm22
{

	public static void main(String[] args)
	{
	
		byte a=28;
		System.out.println("a = "+a);
		a+=a++ + ++a + --a + a--;
		System.out.println("*********AFTER EVALUATION***********");
		System.out.println(a);
		
	}

}
