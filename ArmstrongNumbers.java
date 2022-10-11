import java.util.*;
import java.lang.Math;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of integers to print armstrong numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("The armstrong numbers between the range are:");	
		for(long i=a;i<=b;i++)
		{
			long j=i;
			long rem=0;
			while(j!=0)
			{
			rem=(long)(rem+(Math.pow(j%10,3)));
					j=j/10;	
		}
		if(rem==i)
		{
			System.out.println(rem);	
		}
	}
		scan.close();
	}
}
