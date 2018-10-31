package pc2;

import java.util.Scanner;

public class minheap {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the values");
		for(int k=0;k<n;k++)
		{
			a[k]=sc.nextInt();
		}
		heapify(a);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
		static void heapify(int[] a)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]<a[(j-1)/2])
				{
					int temp=a[j];
					a[j]=a[(j-1)/2];
					a[(j-1)/2]=temp;
				}
			}
		}
}
