package datadriventestingprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> x=new ArrayList<Integer>();
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter values of array");
		for(int i=0;i<n;i++)
		{
			x.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(x.get(j)>x.get(j+1))
				{
					int temp=x.get(j);
					x.set(j,x.get(j+1));
					x.set(j+1,temp);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(x.get(i));
		}
	}

}
