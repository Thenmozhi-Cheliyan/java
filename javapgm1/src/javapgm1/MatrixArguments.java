package javapgm1;

public class MatrixArguments 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int r1=3,c1=3;
		int r2=3,c2=3;
		
		int a[][]= {{1,2,3},{2,4,6},{1,3,5}};
		int b[][]= {{1,5,7},{1,9,1},{2,3,4}};
		
		int product[][]=multiplyMatrices(a,b,r1,c1,r2,c2);
		displayProduct(product);
		
	}
	
	public static int[][] multiplyMatrices(int a[][],int b[][],int r1,int c1,int r2,int c2)
	{
		int[][] product=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					product[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return product;
	}
	
	public static void displayProduct(int product[][])
	{
		System.out.println("Multiplication of two matrices");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(product[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
