import java.util.Scanner;


public class AddSubtractMultiplyDivide {

	public static void mai5n(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number of integers to be added:");
		int n=scan.nextInt();
		System.out.println("Enetr the numbers:");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
		  a[i]=scan.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+a[j];
		}
		System.out.println("The sum of the numbers is:"+sum);
		
		int sub=0;
		for(int j=0;j<n;j++)
		{
			sub=a[j]-sub;
		}
		System.out.println("The subtraction of the numbers is:"+sub);
		
		int pro=1;
		for(int j=0;j<n;j++)
		{
			pro=a[j]*pro;
		}
		System.out.println("The product of the numbers is:"+pro);
		System.out.println("Enter the two numbers for division:");
		int num1=scan.nextInt();
		float num2=scan.nextFloat();
					float div=num1/num2;
		System.out.println("The divison of the two numbers is:"+div);	
		scan.close();
	}
}


