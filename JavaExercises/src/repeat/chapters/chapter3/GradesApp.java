package repeat.chapters.chapter3;


import java.util.Scanner;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        //panta prepei na elegxoume oles tis pithanes vlaves kai bugs pou mporei na prokupsoun
        System.out.println("please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("total marks must not be zero");
            System.exit(1);
        }

        System.out.println("insert courses count.");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("the average must be less or equal than ten");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        }else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        }else {
            System.out.println("Failure");
        }

    }
}
