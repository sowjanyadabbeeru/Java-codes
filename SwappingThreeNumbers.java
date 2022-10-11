import java.util.*;


public class SwappingThreeNumbers {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the three integers:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
	 Swapping(a,b,c);
	scan.close();
		}
	public static int Swapping(int a,int b,int c){
		 int temp;
		 temp=c;
		 c=b;
		 b=a;
		 a=temp;
		 System.out.println("Therefore the swapped numbers are:"+a+b+c);		 
		 return 0;
	}

}
