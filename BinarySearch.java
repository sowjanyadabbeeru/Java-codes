import java.util.Scanner;


public class BinarySearch {

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
		int first,last,middle,pos;
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
		if(a[middle]<search)
		{
			first=middle+1;
			middle=(first+last)/2;
		}
		else if(a[middle]==search)
		{
			 pos=middle+1;
			System.out.println("The integer"+" "+search+" "+"is found at"+" "+pos);
			break;
		}
		else
		{
			last=middle-1;
			middle=(first+last)/2;
		}
	}
          while(first>last)
          {
        	  System.out.println("The integer is not found in the said array");  
          }
          scan.close();
}
}
