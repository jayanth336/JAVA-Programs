package demo;

/* A withdrawal is made on a particular day once in 4 years which is a leap year. 
 * The investment is made back exactly 183 days after the withdrawal. 
 * The program calculates the investment date */

import java.util.Scanner;

public class investment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.nextLine();
		String month = sc.nextLine();
		int count = 183;
		int[] daysArray = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthsArray = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };

		int cur_month = 0;
		int cur_day = day;
		for (int i = 0; i < 12; i++) {
			if (month.equals(monthsArray[i])) {
				cur_month = i;
			}
		}

		while (count > 0) {
			while (daysArray[cur_month] >= cur_day) {
				count--;
				cur_day++;

				if (count == 0) {
					System.out.println(cur_day + " " + monthsArray[cur_month]);
					System.exit(0);
				}
			}
			cur_day = 1;
			cur_month = (cur_month + 1) % 12;
		}
		sc.close();
	}
}
