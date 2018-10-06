import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class binarysearch
{
	public void binary()
	{
		Scanner sc=new Scanner(System.in);
		int[] a={1,15,10,10,10,20,25,};
		Arrays.sort(a);
		int p=0;
		int r=a.length-1;
		System.out.println("enter the value to search");
		int e=sc.nextInt();
		while(p<=r)
		{
			int q=(p+r)/2;
			if(a[q]==e&&a[q-1]==e)
			{
				System.out.println(q-1);
				break;
			}
			
			else if(e>a[q])
			{
				p=p+1;
			}
			else if(e<a[q])
			{
				r=q-1;
			}
			
			else
			{
				System.out.println("The value not found");
			}
		}
	}
	public static void main(String args[])
 	{
 		binarysearch bt=new binarysearch();
 		bt.binary();
 	}
}



/*if(e==a[q])
{
	
	if(a[0]==e)
	{
		System.out.println("The number is at 0 index");
	}
	else if((q-1)>0&&a[q-1]==e)
	{
		System.out.println(q-1);
		
	}
	//}
	else
	{
		System.out.println(q);
	}
	//System.out.println(q);
	break;
}
*/