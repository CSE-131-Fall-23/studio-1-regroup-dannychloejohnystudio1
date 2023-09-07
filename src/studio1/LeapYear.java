package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Provide a year:");
		int year = in.nextInt();
		boolean leap = false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			leap = true;
		}
		System.out.print(year + " is a leap year: " + leap);
	}

}
