/**
 * The ArrayPrinter class provides a method for printing the contents of a string array with a specified separator.
 */
public class ArrayPrinter {

    /**
     * Prints the elements of the given string array to the console with a specified separator.
     *
     * @param actualArray The array of strings to be printed.
     * @param sep         The separator used to separate each printed element.
     */
    public static void arrayPrint(String[] actualArray, String sep){
        for (String i : actualArray) {
            System.out.println(i);
            System.out.println("---"+sep+"----");
        }
    }
}
