package SLA;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {

	public static void main(String[] args) 
	{
	    int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    
//	  for(int i=0;i<arr.length;i++)
//	  {
//		  for(int j=0;j<arr[0].length;j++)
//		  {
//			  System.out.print(arr[i][j] +" ");
//		  }
//		  System.out.println();
//	  }

	    for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length;j++)
		  {
			  System.out.print(arr[j][i]+" ");
		  }
		  System.out.println();
	  }
	    
	  Scanner s=new Scanner(System.in);
	  
	  System.out.println("Enter the number of rows ");
	  int r=s.nextInt();
	  System.out.println("Enter the number of columns ");
	  int c=s.nextInt();
	  
	  int ar[][]=new int[r][c];
	  
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			 System.out.println("Enter the value of ("+i+","+j+")");
			  ar[i][j]=s.nextInt();
		  }
	  }
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  System.out.print(ar[i][j]+ " ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println("Trasportaion of array ");
	  
	  for(int i=0;i<c;i++)
	  {
		  for(int j=0;j<r;j++)
		  {
			  System.out.print(ar[j][i]+" ");
		  }
		  System.out.println();
	  }
	}

}
