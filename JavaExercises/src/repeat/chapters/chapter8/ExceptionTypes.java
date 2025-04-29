package repeat.chapters.chapter8;

import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {

    }

    /*
     * system in read throws IOException
     * Since a checked exception is thorwn
     * to be explicity to be thrown in method signature.
     * or has to be caught(catch)
     * When this type of method / excetpion may be used?
     * when no need handle the exception.
     * is this meaningful? no. ideally we want to handle the exceptions,
     * not only propagate.
     * */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();//throws IOException
    }

    /*
     * if we catch the exception we dont need for throws
     * in method in sigature.and the exception not propagate
     * is it a good practise not to propagate?
     * it depends.if there is a caller then we have to propagate
     * */

    public static char readAnotherChar() {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }


    /*
     * in this type of method/ exception we take
     * action -- logging and also rethrow the exception to propagate to the caller*/
    public static char readAnotherOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    /*
     * mono ta checked exceptions prepei na vazoume sthn epikefalida*/
    public static char readAgainOneChar(char ch) throws IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit!");
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }


//        catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
    }
}
