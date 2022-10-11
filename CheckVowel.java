import java.util.*;


public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character to be checked:");
		char ch=scan.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.println("The character entered is vowel");
		else
			System.out.println("The character entered is not a vowel");	
		scan.close();
	}

}
