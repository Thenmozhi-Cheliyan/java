package javapgm1;

public class Pyramid4 
{
	public static void main(String[] args)
	{
		int i,j,n=9;
		
		for(i=1;i<=n;i++) 
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");	
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
	}
}
