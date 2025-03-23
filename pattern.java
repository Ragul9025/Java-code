package ragul;
import java.util.*;
public class pattern {

	public static void main(String args []) 
	{
		//square 
		System.out.println("square");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" *"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle");
		for(int k=0;k<=4;k++)
		{
			for(int h=k;h<4;h++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<=k;l++)
			{
			System.out.print("@ ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("rectangle");
		for(int y=0;y<4;y++)
		{
			for(int z=0;z<6;z++)
			{
				if(y==0 || y==3 || z==0 ||z==5)
				{
				System.out.print(" #");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("reverse Triangle");
		
		for(int t=0;t<5;t++)
		{
			for(int r=t;r<5;r++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("number triangle ");
		
		for(int a=1;a<=5;a++)
			{
			  for(int b=1;b<=a;b++)
			  {
				  System.out.print(b+" ");
			  }
			  System.out.println();
			}
		System.out.println("Ringht pascal triangle");
		
		for(int q=0;q<5;q++)
		{
			for(int c=0;c<=q;c++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		for(int v=0;v<4;v++)
		{
			for(int n=v;n<4;n++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println("ringht pascal triangle");
		
		for(int m=0;m<5;m++)
		{
			for(int a1=m;a1<4;a1++)
			{
				System.out.print("  ");
			}
			for(int b1=0;b1<=m;b1++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		for(int c1=0;c1<4;c1++)
		{
			for(int d1=0;d1<=c1;d1++)
			{
				System.out.print("  ");
			}
			for(int e1=c1;e1<4;e1++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println("K pattern");
		System.out.println();
		for(int x1=0;x1<5-1;x1++)
		{
			for(int y1=x1;y1<5;y1++)
			{
				System.out.print("K ");
			}
			System.out.println();
		}
		for(int z1=0;z1<5;z1++)
		{
			for(int w1=0;w1<=z1;w1++)
			{
				System.out.print("K ");
			}
			System.out.println();
		}
		
		System.out.println("0's and 1's ");
		
		for(int a2=1;a2<=5;a2++)
		{
			for(int b2=1;b2<=a2;b2++)
			{
				if((a2+b2)%2==0)
				{
					System.out.print("1 "+" ");
				}
				else 
				{
					System.out.print("0 "+" ");
				}
			}
			System.out.println();
		}
		System.out.println("square hallow pattern");
		
		for(int c2=1;c2<=5;c2++)
		{
			for(int d2=1;d2<=5;d2++)
			{
				if(c2==1 || c2==5 ||d2==1 ||d2==5)
				{
					System.out.print("$ ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Triangle 1-3-5-7");
		
		for(int x2=1;x2<=5;x2++)
		{
			for(int y2=x2;y2<=5;y2++)
			{
				System.out.print("  ");
			}
			for(int z2=1;z2<=x2*2-1;z2++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("reverse number");
		for(int p1=0;p1<5;p1++)
		{
			for(int q1=0;q1<=p1;q1++)
			{
				System.out.print(" ");
			}
			for(int r1=p1;r1<5;r1++)
			{
				System.out.print(r1+1+" ");
			}
			System.out.println();
		}
		System.out.println("different number triangle");
		for(int p2=1;p2<=5;p2++)
		{
			for(int q2=p2;q2<=5;q2++)
			{
				System.out.print(" ");
			}
			for(int r2=p2;r2>=1;r2--)
			{
				System.out.print(r2);
			}
			for(int r2=2;r2<=p2;r2++)
			{
				System.out.print(r2);
			}
			System.out.println();
		}
		System.out.println("upper and lower");
		System.out.println("Enter the Number");
		Scanner scan =new Scanner (System.in);
		int row=scan.nextInt();
		for(int a3=0;a3<row;a3++)
		{
			for(int b3=a3;b3<row-1;b3++)
			{
				System.out.print(" ");
			}
			for(int b3=0;b3<a3*2+1;b3++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int c3=row-1;c3>0;c3--)
		{
			for(int d4=c3;d4<=row-1;d4++)
			{
				System.out.print(" ");
			}
			for(int d4=0;d4<c3*2-1;d4++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("butter fly");
		for(int a0=0;a0<4;a0++)
		{
			for(int b0=0;b0<a0;b0++)
			{
				System.out.print("* ");
			}
			for(int b0=a0;b0<4;b0++)
			{
				System.out.print("  ");
			}
			for(int b0=a0;b0<4;b0++)
			{
				System.out.print("  ");
			}
			for(int b0=0;b0<a0;b0++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int c0=0;c0<4;c0++)
		{
			for(int d0=c0;d0<4;d0++)
			{
				System.out.print("* ");
			}
			for(int d0=0;d0<c0;d0++)
			{
				System.out.print("  ");
			}
			for(int d0=0;d0<c0;d0++)
			{
				System.out.print("  ");
			}
			for(int d0=c0;d0<4;d0++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}
