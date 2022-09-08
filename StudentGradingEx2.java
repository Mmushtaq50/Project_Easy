package Project_Ez;

import java.util.Scanner;

public class StudentGradingEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks (-1 to quit) : ");
		double marks = scan.nextDouble();

		if (marks > 90 && marks <= 100) {
			System.out.println("Grade A");
			
		} else if (marks > 80 && marks <= 89) {
			System.out.println("Grade B");
			
		} else if (marks > 70 && marks <= 79) {
			System.out.println("Grade C");
			
		} else if (marks > 0 && marks <= 69) {
			System.out.println("Grade F");
				
		} else {			
			System.out.println(marks+  " is invalid, A valid grade is 0-100 ");
		}
	}
}
