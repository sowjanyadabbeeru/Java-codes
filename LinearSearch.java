import java.util.*;


public class LinearSearch {

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
		System.out.println("Enter the integer to be searched in the array:");
		int search=scan.nextInt(); 
		int pos=0;
		for(int i=0;i<n;i=i+1)
		{
			if(a[i]==search);
			{
			pos=i+1;
			break;
		}
		}
		System.out.println("The integer"+" "+search+" "+"is found at position:"+pos);
		scan.close();
	}
}
