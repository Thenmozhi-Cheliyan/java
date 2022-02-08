package javapgm1;

public class PrefixPostfix {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("PROGRAM TO PRODUCE OUTPUT LIKE a=2b=3c=4d=1");
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b;	
		c++;
		d=a++;
		
		System.out.print("a="+a);
		System.out.print("b="+b);
		System.out.print("c="+c);
		System.out.print("d="+d);
		
		System.out.println();
		System.out.println("********DIFFERENTIATING POST AND PRE-DECREMENT**********");
		
		if(d==1)
		{
			System.out.println("c="+c);		//value of c is 4
			System.out.println("c="+c--);	//post decrement -->in memory c=3 but prints c=4
			System.out.println("c="+--c);	//pre-decrement --> prints the decremented value c=2 because in memory c=3
			
		}
	}
}
