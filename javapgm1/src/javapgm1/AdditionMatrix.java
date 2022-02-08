package javapgm1;
import java.util.*;
public class AdditionMatrix
{

	public static void main(String[] args) 
	{
		int i,j,row,column;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		row=s.nextInt();
		System.out.println("Enter the number of columns:");
		column=s.nextInt();

		int matrix1[][]=new int [row][column];
		int matrix2[][]=new int [row][column];
		int add[][]=new int [row][column];
		
		// getting 1st matrix
		System.out.println("Enter the elements of 1st matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		
		//getting 2nd matrix
		System.out.println("Enter the elemrnts of 2nd matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		
		//adding 2 matrices
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				add[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("***********************RESULTANT ADDITION MATRIX**************************");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+matrix1[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.print("  +");
		System.out.println();
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+matrix2[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.print("  =");
		System.out.println();
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+add[i][j]+"    ");
		
			}
			System.out.println();
		}
	}

}
