import java.util.Scanner;
public class SoujiSum{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		SoujiSum s=new SoujiSum();
		int R=s.Sum(a,b);
		System.out.println(R);
		scan.close();
	}
	int Sum(int a,int b){
		return a+b;
	}
}
