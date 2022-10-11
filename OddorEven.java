import java.util.Scanner;


public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int i=scan.nextInt();
		if(i%2==0)
		System.out.println("The integer"+" "+i+"is even");
		else
			System.out.println("The integer"+" "+i+"is odd");
		scan.close();
	}
}
