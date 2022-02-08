package javapgm1;
public class Pyramid5 
{
	public static void main(String[] args)
	{
		int i,j,k,l;
		int count=1;
		for(i=9;i>=1;i--)
		{
			for(j=1;j<=i*2;j++)
			{
				System.out.print(" ");	
			}
		for(k=i;k<=9;k++)
		{
			System.out.print(k+" ");
		}
		for(l=9-1;l>=i;l--)
		{
			System.out.print(l+" ");
		}
		System.out.println();
		count++;
		}		
	}
}
