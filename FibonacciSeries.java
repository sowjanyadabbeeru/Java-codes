import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of integers:");
		long n=scan.nextLong();
		long next,first=0,second=1;
		for(long i=0;i<=n;i++)
		{
			if(i<=1){
				next=i;
			}
			else{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(next);
		}	
		scan.close();
	}
}
