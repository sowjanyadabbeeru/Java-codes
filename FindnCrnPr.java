import java.util.*;


public class FindnCrnPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integers n and r:");
		int n=scan.nextInt();
		int r=scan.nextInt();
 findnCr(n,r);
 findnPr(n,r);
scan.close();
	}
public static long findnCr(int n,int r){
	 long result=factorial(n)/(factorial(n-r)*factorial(r));
	 System.out.println("nCr is:"+result);
	 return result;
}
public static long findnPr(int n,int r){
	long result=factorial(n)/(factorial(n-r));
	System.out.println("nPr is:"+result);
	 return result;
}
public static long factorial(int n){
	if(n>0){
    long result=n*factorial(n-1);
    return result;
	}
	else{
		return 1;
    }
}
}

		

