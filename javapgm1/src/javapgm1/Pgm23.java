package javapgm1;

public class Pgm23
{

	public static void main(String[] args)
	{
	
		int x=100;
		System.out.println("x = "+x);
		x= x++ * 2 + 3 * --x;
		System.out.println("***********AFTER EVALUATION************");
		System.out.println("x = "+x);
		}

}
