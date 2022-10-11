import java.util.Scanner;


public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		if(n%400==0)
		System.out.println("The number entered is a leap year");
		else if(n%100==0)
			System.out.println("The number entered is not a leap year");
		else if(n%4==0)
			System.out.println("The number entered is a leap year");
		else
			System.out.println("The number entered is not a leap year");
		scan.close();
	}

}
