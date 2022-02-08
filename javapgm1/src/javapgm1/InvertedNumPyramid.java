package javapgm1;

public class InvertedNumPyramid 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,k,row=9;
		for(i=row;i>=1;i--)
		{
			for(j=row;j>=i;j--)
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
