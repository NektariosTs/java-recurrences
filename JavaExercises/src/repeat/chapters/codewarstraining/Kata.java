package repeat.chapters.codewarstraining;

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

        int mathe;

        mathe = Kaata.opposite(123);
        System.out.println(mathe);
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
}




