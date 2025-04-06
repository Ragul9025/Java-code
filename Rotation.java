package ragul;

import java.util.Arrays;

public class Rotation 
{
  public static int[] reverse(int a[],int s,int e)
  {
	  int start=s;
	  int end=e;
	  while(start<end)
	  {
		  int temp=a[start];
		  a[start]=a[end];
		  a[end]=temp;
		  start++;
		  end--;
	  }
	  return a;
  }
	public static void main(String[] args) 
	{
		int a[];
		a=new int[3];
		int arr[]= {1,2,3,4,5};
		int k=44;
		k=k%arr.length;
		// 1-> 5,1,2,3,4
		//2->  4,5,1,2,3
		int b[]=reverse(arr,(arr.length-k),arr.length-1);
		System.out.println(Arrays.toString(reverse(arr,0,(arr.length-k-1))));
		int c[]=reverse(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(c));
        
		 
	}

}
