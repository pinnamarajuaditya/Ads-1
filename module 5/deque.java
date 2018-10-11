import java.util.Scanner;
 class deque1 {

	int n=6;
	int[] a=new int[n];
	int front1=0;
	int rear1=0;
	int front2=n-1;
	int rear2=n-1;
	Scanner sc=new Scanner(System.in);
	void addatfront()
	{
		System.out.println("enter the data");
		int b=sc.nextInt();
		if(front1<0)
		{
			System.out.println("underflow");
		}
		else
		{
			front1++;
			a[front1]=b;
			
			
			//System.out.println(front1);
		}
		
	}
	boolean isEmpty()
	{
		if(front1==0&&rear1==0)
		{
			return true;
		}
		return false;
	}
	void deleteatfront()
	{
		if(front1==rear1)
		{
			System.out.println(a[rear1]);
			front1=0;
			rear1=0;
		}
		else if(isEmpty())
		{
			System.out.println("u cannot delete");
		}
		else
		{
			//int q=a[rear1];
			System.out.println(a[rear1]);
			rear1++;
			
		}
	}
	void addatrear()
	{
		System.out.println("enter the value");
		int c=sc.nextInt();
		if(front2>n-1)
		{
			System.out.println("overflow");
		}
		else
		{
			a[front2]=c;
			System.out.println(a[front2]);
			front2--;
		}
	}
	void deleteatrear()
	{
		if(front2==n-1&&rear2==n-1)
		{
			System.out.println("you cannot delete");
		}
		else
		{
			System.out.println(a[rear2]);
			rear2=rear2-1;
			//System.out.println("deleted");
		}
	}
    void show()
	{
    	
		for(int i=rear1;i<rear2;i++)
		{
			System.out.println(a[i]);
		}
    	
	}
 }
public class deque
{
	public static void main(String args[])
	{
		
		deque1 d1=new deque1();
		int f;
		do
		{
		System.out.println("1.add at front 2.delete at front 3.add at end 4.delete at end 5.display");
		Scanner sc=new Scanner(System.in);
		f=sc.nextInt();
		
		switch(f)
		{
		case 1:d1.addatfront();
				//d1.show();
				break;
		case 2:d1.deleteatfront();
				//d1.show();
				break;
		case 3:d1.addatrear();
				//d1.show();
				break;
		case 4:d1.deleteatrear();
				//d1.show();
				break;
		case 5: d1.show();
				break;
		}
		}while(f<6);
	}
}











