package javapgm1;

public class Fibannocci 
{

	public static void main(String[] args)
	{
		int i,n1,n2,n3;
		n1=0;
		n2=1;
		System.out.println("FIBANACCI SERIES");
		System.out.print(n1+" "+n2);
		for(i=2;i<=10;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
