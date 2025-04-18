package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * if you can vote
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int age = 0;

        System.out.println("insert your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.printf("your age is: %d, you can vote: %b", age, isEligible);

    }
}
