public class Main {

    /**
     * The main method is the entry point for the application. It performs the following tasks:
     * 1. Defines the target string.
     * 2. Reads data from a file using the FileReader class.
     * 3. Sorts the products using the ArraySorter class.
     * 4. Filters the products containing the target string using the ArrayFilter class.
     * 5. Removes duplicate products using the DuplicationFilter class.
     * 6. Validates duplication within the product list.
     * 7. Writes the sorted products to a file using the FileWriter class.
     * 8. Prints various arrays to the console using the ArrayPrinter class.
     *
     */
    public static void main(String[] args) {
        String target = "coca-cola";

        String[] products = FileReader.readFile();

        String[] sortedProducts = ArraySorter.arraySort(products);

        String[] filteredProducts = ArrayFilter.arrayFiltration(products,target);

        String[] productsWithoutDuplication = DuplicationFilter.duplicationFiltration(products);

        String duplicationValidation = DuplicationFilter.duplicationValidator(products, productsWithoutDuplication);

        String fileWriterResult = FileWriter.fileWriter(sortedProducts);

        ArrayPrinter.arrayPrint(products,"o");
        ArrayPrinter.arrayPrint(sortedProducts,"s");
        ArrayPrinter.arrayPrint(filteredProducts,"f");
        ArrayPrinter.arrayPrint(productsWithoutDuplication,"df");
        System.out.println(duplicationValidation);
        System.out.println(fileWriterResult);
    }
}
