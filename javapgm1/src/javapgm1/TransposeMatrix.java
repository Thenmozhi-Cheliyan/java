package javapgm1;

import java.util.Scanner;

public class TransposeMatrix
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,row,column;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		row=s.nextInt();
		System.out.println("Enter the number of columns:");
		column=s.nextInt();

		int matrix[][]=new int [row][column];
		
		// getting the matrix
		
		System.out.println("Enter the elements of 1st matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		
		//matrix format of original matrix
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+matrix[i][j]+"   ");
			}
			System.out.println();
		
		}
		
		System.out.println("***********************RESULTANT TRANSPOSE MATRIX**************************");
		
		for(i=0;i<column;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(" "+matrix[j][i]+"   ");
			}
			System.out.println();
		}
	}
}
