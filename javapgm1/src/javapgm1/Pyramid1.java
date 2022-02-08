package javapgm1;

public class Pyramid1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int row=9,i,j,k;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			
		for(k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	}
}
