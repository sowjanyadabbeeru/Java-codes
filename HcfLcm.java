import java.util.Scanner;
public class HcfLcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integers:");
		int i=scan.nextInt();
		int j=scan.nextInt();
        int	a=i;
		int b=j;
		while(b!=0){
			int t=b;
			b=a%b;
			a=t;
		}
		int hcf=a;
		int lcm=(i*j)/hcf;
		System.out.println("The hcf and lcm of"+i+" "+"and"+" "+j+"are:"+hcf+" "+lcm);
		scan.close();
	}

}
