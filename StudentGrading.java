package Project_Ez;

import java.util.Scanner;

public class StudentGrading {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter your Grade (-1 to quit) : ");
		double score = sc.nextDouble();
		int newScore = (int) (score / 10);
		//System.out.println("**newScore**" + newScore);
		if (newScore >= 10)
			newScore = 9;
		switch (newScore) {
		case 9:
			System.out.println("score between 90-100");
			System.out.println("Grade A");
			break;

		case 8:
			System.out.println("score between 80-89");
			System.out.println("Grade B");
			break;

		case 7:
			System.out.println("score between 70-79");
			System.out.println("Grade C");
			break;

		case 6:
			System.out.println("score between 0-69");
			System.out.println("Grade F");
			break;

		default:
			System.out.println(score+  " is invalid, A valid grade is 0-100 ");

		}
	}
}
