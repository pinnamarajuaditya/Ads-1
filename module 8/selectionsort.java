import java.util.Scanner;

public class selectionsort {
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String team[]=new String[n];
	int wins[]=new int[n];
	int loss[]=new int[n];
	int draw[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the name");
		team[i]=sc.next();
		System.out.println("enter wins");
		wins[i]=sc.nextInt();
		System.out.println("enter losses");
		loss[ i]=sc.nextInt();
		System.out.println("enter draws");
		draw[i]=sc.nextInt();
	}
	for(int k=0;k<n;k++)
	{
		int min=k;
		System.out.println(min);
		for(int l=k+1;l<n;l++)
		{
			if(wins[l]>wins[min])
			{
				min=l;
				System.out.println(min);
			}
			if(wins[l]==wins[min])
			{
				if(loss[l]<loss[min])
				{
					min=l;
					System.out.println(min);
				}
			
				
			
				if((wins[l]==wins[min]) && (loss[l]==loss[min]))
				{
					if(draw[l]>draw[min])
					{
						min=l;
						System.out.println(min);
					}
				}
			}
			}
		int temp=wins[min];
		wins[min]=wins[k];
		wins[k]=temp;
		String temp1=team[min];
		team[min]=team[k];
		team[k]=temp1;
	}
	
	for(int m=0;m<n;m++)
	{
		System.out.println("names"+ team[m]);
		System.out.println("wins :"+wins[m]);
		System.out.println("loss :"+loss[m]);
		System.out.println("draw :"+draw[m]);
		
	}
	
	/*for(int j=0;j<n;j++)
	{
		System.out.println(team[j]);
		System.out.println(wins[j]);
		System.out.println(loss[j]);
		System.out.println(draw[j]);
	}*/
	}
}
