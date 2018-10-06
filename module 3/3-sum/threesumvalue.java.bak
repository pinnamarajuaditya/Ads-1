import java.util.Arrays;
import java.util.Scanner;
class threesumvalue {
	 public void sum()
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 int n=sc.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		
		 int sum=0;
		 int count=0;
		 for(int j=0;j<n-2;j++)
		 {
			 int st=j+1;
			 int lt=a.length-1;
			 while(st<lt)
			 {
				 if(a[j]+a[st]+a[lt]==sum)
				 {
					 count++;
					 System.out.println(count);
					 break;
				 }
				 if(a[j]+a[st]+a[lt]<sum)
				 {
					 st=st+1;
				 }
				 if(a[j]+a[st]+a[lt]>sum)
				 {
					 lt=lt-1;
				 }
				 
			 }
			 
		 }
		
			
	 }
}
