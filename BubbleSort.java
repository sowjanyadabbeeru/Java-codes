import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of integers in an array:");
		int n=scan.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the"+" "+n+" "+"inetgers:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("The sorted integers in an array are:");
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		for(int k=n-1;k>=0;k--)
		{
			System.out.println(a[k]);
		}
		scan.close();
	}
}
