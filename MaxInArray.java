import java.util.Scanner;


public class MaxInArray {

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
		int max=a[0];
		for(int j=0;j<n;j++){
			if(a[j]>max)
				max=a[j];
		}
			scan.close();
			System.out.println(max);
	}
}
