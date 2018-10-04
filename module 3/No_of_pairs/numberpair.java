import java.util.Arrays;
import java.util.Scanner;
public class numberpair{
	public void array(int[] a)
	{
		int b=a.length;
		Arrays.sort(a);
		for(int j=0;j<b;j++)
		{
			System.out.print(a[j]);
		}
		int count=0;
		int temp=0;
		for(int i=0;i<b-1;i++)
		{
			if(a[i]!=temp)
			{
			 if(a[i]==a[i+1])
			{
				temp=a[i];
				count++;
			}
			}
		}
		System.out.println();
		System.out.println("the number pairs are " +count);
	}
}
