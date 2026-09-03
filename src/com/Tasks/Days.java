package com.Tasks;
import java.util.Scanner;
public class Days {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day : ");
		String day=s.next();
		day=day.toLowerCase();
		switch(day) {
		case "Sunday":
			System.out.println("Sunday is the first day of week");
			break;
		case "Monday":
			System.out.println("Monday is the second day of the week");
			break;
		case "Tuesday":
			System.out.println("Tuesday is the third day of the week");
			break;
		case "Wednesday":
			System.out.println("Wednesday is the fourth day of the week");
			break;
		case "Thursday":
			System.out.println("Thursday is the fifth day of the week");
			break;
		case "Friday":
			System.out.println("Friday is the sixth day of the week");
			break;
		case "Saturday":
			System.out.println("Saturday is the seventh day of the week");
			break;
		default:
			System.out.println("Invalid input ! please enter the valid input");
		}
		s.close();

	}

}
