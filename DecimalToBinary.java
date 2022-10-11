import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int dec=scan.nextInt();
		int a[]=new int[100];
		int i=0;
		while(dec!=0)
		{
			a[i]=dec%2;
			dec=dec/2;
			i++;
		}
		System.out.print("The binary number is:");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		scan.close();
	}

}
