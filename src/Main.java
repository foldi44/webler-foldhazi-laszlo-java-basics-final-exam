public class Main {
    public static void main(String[] args) {
        String target = "coca-cola";

        String[] products = FileReader.readFile();
        for (String i : products) {
            System.out.println(i);
            System.out.println("--------");
        }

        String[] sortedProducts = ArraySorter.arraySort(products);
        for (String i : sortedProducts) {
            System.out.println(i);
            System.out.println("---s----");
        }
    }
}
