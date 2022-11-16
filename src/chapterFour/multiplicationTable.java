package chapterFour;

public class multiplicationTable {

    public static void main(String[] args) {

        int number = 5;
        for(int i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
    }
}
