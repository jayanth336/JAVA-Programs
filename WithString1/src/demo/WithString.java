package demo;

import java.util.Scanner;

/* A given string contains a number at its end. 
 * Remove characters 'a', '7' and '56' from the string 
 * and verify whether the number present at the end of 
 * current string equals the string length excluding the number*/

public class WithString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		s = s.replace("a", "");
		s = s.replace("7", "");
		s = s.replace("56", "");
		
		int n = s.length();
		int sum = 0;
		int x=1;
		int count = 0;
		for(int i=n-1; i>=0; i--) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum += (s.charAt(i) -'0')*x;
				x *= 10;
				count++;
				if(sum>=n) {
					System.out.println("Not equal to the string length");
					System.exit(0);
				}
			}
		}
		if(n-count == sum) {
			System.out.println("Yes number at the end is equal to string length");
		}
		else {
			System.out.println("Not equal to the string length");
		}
		sc.close();
	}		
}
