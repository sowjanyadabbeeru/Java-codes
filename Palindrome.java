import java.util.Scanner;


public class Palindrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a=scan.nextInt();
		int rev=0;
		int t=a;
       while(t!=0)
       {
    	   rev=rev*10+t%10;
    	   t=t/10;
       }
	if(rev==a)
		System.out.println("The integer is a palindrome");
	else
		System.out.println("The integer is not a palindrome");	
	 scan.close();
}
}
