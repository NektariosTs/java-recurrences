package repeat.chapters.codewarstraining;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {

//        String bio = new Bio().dnaToRna("GCAT");
//
////        System.out.println(bio);
//        int dice = 0;
//        dice = (int) (Math.random() * 6) + 1;
//        System.out.println(dice);

//        int mtion;
//        mtion = Move.move(4,3);
//        System.out.println(mtion);

//        int mathe;
//
//        mathe = Kaata.opposite(123);
//        System.out.println(mathe);

//        String motion;
//        motion = sumStr("3", "2");
//        System.out.println(motion);

//        String s;
//        s = SmashWords.smash("hello", "world", "this", "is", "great");
//        System.out.println(s);..



        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(Kataaa.findNeedle(haystack1));

    }

    /*Write a function that takes an array of numbers and returns the sum of the numbers.
      The numbers can be negative or non-integer. If the array does not contain any numbers
      then you should return 0.*/
    public static class SumArray {

        public static double sum(double[] numbers) {
            return 1;
        }
    }


    /// *Create a function which translates a given DNA string into RNA.
//For example: "GCAT"  =>  "GCAU"
//*
    public static class Bio {
        public String dnaToRna(String dna) {

            String replace = dna.replace("T", "U");
            System.out.println(replace);

            return dna;
        }
    }


    /*Create a function for the terminal game
    that takes the current position of the hero and the roll (1-6)
    and return the new position.*/

    public static class Move {
        public static int move(int position, int roll) {
            // your code here
            return position + (roll * 2);
        }

    }

    /*Very simple, given a number (integer / decimal / both depending on the language),
     find its opposite (additive inverse).*/


    public class Kaata {
        public static int opposite(int number) {
//            return -number;
            if (number == 0) {
                return number;
            } else {
                return -number;
            }

        }
    }


    /*Create a function that takes 2 integers in form of a string as an input,
    and outputs the sum (also as a string):*/


    /*Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
     You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
      Be careful, there shouldn't be a space at the beginning or the end of the sentence!

      Example
      ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'*/
    public static String sumStr(String a, String b) {
        String num1;
        String num2;
        int sum;

        num1 = a.isEmpty() ? "0" : a;
        num1 = b.isEmpty() ? "0" : b;

        sum = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(sum);
    }

    public class SmashWords {

        public static String smash(String... words) {
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                sb.append(word).append(" ");
            }

            String sentence = sb.toString().trim();

            return sentence;
        }

    }

    /*Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].*/

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];

        int count = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                sum += input[i];
            }
        }


        return new int[]{count, sum}; //return an array with count of positives and sum of negatives
    }


    /*Το διαστημόπλοιο Enterprise έχει συναντήσει κάποιο πρόβλημα
     κατά τη δημιουργία ενός προγράμματος για να χαιρετά όλους  καθώς επιβιβάζονται.
     Είναι δουλειά σας να διορθώσετε τον κώδικα και να επαναφέρετε το πρόγραμμα σε λειτουργία!*/
    public class GrassHopper {

        public static String sayHello(String name) {

            System.out.println("Hello, " + name);
            return "Hello, " + name;
        }
    }

    /*Can you find the needle in the haystack?
Write a function findNeedle() that takes an array full of junk but containing one "needle"
After your function finds the needle it should return a message (as a string) that says:
"found the needle at position " plus the index it found the needle, so:
Example(Input --> Output)
["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5" */

    public class Kataaa {
        public static String findNeedle(Object[] haystack) {


            for (int i = 0; i < haystack.length; i++) {
              if ("needle".equals(haystack[i])) {
                  return  "found the needle at position " + i;
              }
            }
            return "needle not found";
        }
    }
}







