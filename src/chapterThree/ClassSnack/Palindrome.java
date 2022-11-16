package chapterThree.ClassSnack;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter three digit number: ");
		int ThreeDigitNumber = input.nextInt();
		
		int DigitNumber1 = ThreeDigitNumber / 100 % 10;
		int DigitNumber3 = ThreeDigitNumber % 10;


			if (DigitNumber1 == DigitNumber3 ) {
				System.out.println ( "PALINDROME!");
			}

			if (DigitNumber1 != DigitNumber3 ) {
				System.out.println ( "NOT PALINDROME!");
			}



	}

}