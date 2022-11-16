package chapterFour;

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float largest = Float.NEGATIVE_INFINITY;
        float smallest = Float.POSITIVE_INFINITY;

        System.out.print("Input number or enter 0 to end: ");
        int inputNumber = input.nextInt();


        while (inputNumber != 0) {

            if (inputNumber > largest) {
                largest = inputNumber;
            }

            if (inputNumber < smallest) {
                smallest = inputNumber;
            }
            System.out.print("Input number or enter 0 to end: ");
            inputNumber = input.nextInt();

        }

        System.out.printf ("The largest number is %f%n",largest);
        System.out.printf("The smallest number is %f%n", smallest);

    }
}
