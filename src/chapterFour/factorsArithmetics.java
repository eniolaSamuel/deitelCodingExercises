package chapterFour;

import java.util.Scanner;

public class factorsArithmetics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int inputNumber = input.nextInt();

        for(int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.printf("%d has %d%n factors", inputNumber, i);
            }
        }


    }
}
