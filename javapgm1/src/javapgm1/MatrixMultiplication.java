package javapgm1;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the size of matrix:");
	        n = input.nextInt();
	        int[][] a=new int[n][n];
	        int[][] b=new int[n][n];
	        int[][] c=new int[n][n];
	        System.out.println("Enter the elements of 1st martix:");
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                a[i][j]=input.nextInt();
	            }
	        }
	        System.out.println("Enter the elements of 2nd martix:");
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                b[i][j]=input.nextInt();
	            }
	        }
	        System.out.println("Multiplying the matrices...");
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                for(int k=0;k<n;k++)
	                {
	                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
	                }
	            }
	        }
	        System.out.println("Resultant Matrix");
	        for(int i=0;i<n;i++)
	        {
	            for (int j=0;j<n;j++)
	            {
	                System.out.print(c[i][j]+" ");
	            }
	            System.out.println();
	        }
	        input.close();

	}

}
