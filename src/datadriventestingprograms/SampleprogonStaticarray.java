package datadriventestingprograms;

import java.util.Scanner;

public class SampleprogonStaticarray 
{

	public static void main(String[] args) 
	{
       //take the data from keyboard
		
		int[] x=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values in array");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(x[j]>x[j+i])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}	
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
		
	}
}
