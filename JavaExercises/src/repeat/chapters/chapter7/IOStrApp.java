package repeat.chapters.chapter7;

import java.util.Scanner;
/*IO in strings*/
public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next();             //diavazei mexri na vrei white spaces(spaces, \t,\n)
        s2 = in.nextLine();         //diavazei ta panta mexri na vrei \n

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
