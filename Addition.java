import java.util.*;
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
System.out.println("The sum of teh numbers is:"+sum);
scan.close();
	}

}
