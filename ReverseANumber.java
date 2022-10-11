import java.util.Scanner;


public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a=scan.nextInt();
		int rev=0;
       while(a!=0)
       {
    	   rev=rev*10+a%10;
    	   a=a/10;
       }
       System.out.println("The reversed number is:"+rev);
       scan.close();
	}
	
}
