import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int i=scan.nextInt();
		int fact=1;
		for(int j=1;j<=i;j++)
		fact=fact*j;
		System.out.println("The factorial of the integer is:"+" "+fact);
		scan.close();
	}
}
