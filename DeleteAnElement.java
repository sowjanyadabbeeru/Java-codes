import java.util.Scanner;


public class DeleteAnElement {

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
		System.out.println("Enter the integer to be deleted in the array from the position:");
	    int pos=scan.nextInt();
		for(int i=pos-1;i<n-1;i=i+1)
			{
			a[i]=a[i+1];
	}
		System.out.println("Enter the number of integers in an deleted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
scan.close();
}
}
