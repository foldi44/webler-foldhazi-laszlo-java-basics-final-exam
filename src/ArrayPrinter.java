public class ArrayPrinter {
    public static void arrayPrint(String[] actualArray, String sep){
        for (String i : actualArray) {
            System.out.println(i);
            System.out.println("---"+sep+"----");
        }
    }
}
