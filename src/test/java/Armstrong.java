

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int n = ss.nextInt();
		int num,rem,res=0;
		num=n;
		
		while (num!=0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
			
		}
		if (n==res) {
			System.out.println(n+" " +"is a armstrong number");
			
		}
		else {
			System.out.println(n+ "is not a armstrong number");
		}
		
	}

}
