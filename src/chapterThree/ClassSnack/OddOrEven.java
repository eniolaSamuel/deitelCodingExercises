package chapterThree.ClassSnack;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		
	Scanner input = new Scanner(System.in);

	System.out.print("Input number: ");
		int InputNumber = input.nextInt();


			if ((InputNumber % 2) == 0 ) {
				System.out.printf ( "%d is an Even Number!", InputNumber);
			}

			if ((InputNumber % 2) == 1 ) {
				System.out.printf ( "%d is an Odd Number!", InputNumber);
			}

	}

}